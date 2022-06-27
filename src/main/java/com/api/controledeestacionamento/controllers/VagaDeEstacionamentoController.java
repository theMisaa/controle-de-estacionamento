package com.api.controledeestacionamento.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.controledeestacionamento.dtos.VagaDeEstacionamentoDto;
import com.api.controledeestacionamento.models.VagaDeEstacionamentoModel;
import com.api.controledeestacionamento.services.VagaDeEstacionamentoService;

@RestController
@RequestMapping("/vaga-estacionamento")
public class VagaDeEstacionamentoController {

    final VagaDeEstacionamentoService vagaDeEstacionamentoService;


    public VagaDeEstacionamentoController(VagaDeEstacionamentoService vagaDeEstacionamentoService) {
        this.vagaDeEstacionamentoService = vagaDeEstacionamentoService;
    }

    @PostMapping
    public ResponseEntity<Object> salvarVaga(@RequestBody @Valid VagaDeEstacionamentoDto vagaDeEstacionamentoDto){
        var vagaDeEstacionamentoModel = new VagaDeEstacionamentoModel();
        BeanUtils.copyProperties(vagaDeEstacionamentoDto, vagaDeEstacionamentoModel);
        vagaDeEstacionamentoModel.setDataDoRegistro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(vagaDeEstacionamentoService.salvar(vagaDeEstacionamentoModel));
    }
    
    @GetMapping
    public ResponseEntity<List<VagaDeEstacionamentoModel>>listarTodos(){
    	return ResponseEntity.status(HttpStatus.OK).body(vagaDeEstacionamentoService.findAll());
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> listarUmPorId(@PathVariable(value = "id") Integer id){
    	Optional<VagaDeEstacionamentoModel> vagaOptional = vagaDeEstacionamentoService.findById(id);
    	if(!vagaOptional.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga nao encontrada");
    	}
    	
    	return ResponseEntity.status(HttpStatus.OK).body(vagaOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletarPorId(@PathVariable(value = "id") Integer id){
    	Optional<VagaDeEstacionamentoModel> vagaOptional = vagaDeEstacionamentoService.findById(id);
    	if(!vagaOptional.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga nao existe");
    	}
    	vagaDeEstacionamentoService.delete(vagaOptional.get());
    	return ResponseEntity.status(HttpStatus.OK).body("Vaga deletada com sucesso");
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Object> update(@PathVariable(value = "id") Integer id, 
    		@RequestBody @Valid VagaDeEstacionamentoDto vagaDeEstacionamentoDto){
    	Optional<VagaDeEstacionamentoModel> vagaOptional = vagaDeEstacionamentoService.findById(id);
    	if(!vagaOptional.isPresent()) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Vaga nao existe");
    	}
    	var vagaDeEstacionamentoModel = new VagaDeEstacionamentoModel();
    	BeanUtils.copyProperties(vagaDeEstacionamentoDto, vagaDeEstacionamentoModel);
    	vagaDeEstacionamentoModel.setId(vagaOptional.get().getId());
    	vagaDeEstacionamentoModel.setDataDoRegistro(vagaOptional.get().getDataDoRegistro());
    	return ResponseEntity.status(HttpStatus.OK).body(vagaDeEstacionamentoService.salvar(vagaDeEstacionamentoModel));
    }

}
