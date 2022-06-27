package com.api.controledeestacionamento.services;

import com.api.controledeestacionamento.models.VagaDeEstacionamentoModel;
import com.api.controledeestacionamento.repositories.VagaDeEstacionamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

@Service
public class VagaDeEstacionamentoService {

   final VagaDeEstacionamentoRepository vagaDeEstacionamentoRepository;


    public VagaDeEstacionamentoService(VagaDeEstacionamentoRepository vagaDeEstacionamentoRepository) {
        this.vagaDeEstacionamentoRepository = vagaDeEstacionamentoRepository;
    }


    @Transactional
    public VagaDeEstacionamentoModel salvar(VagaDeEstacionamentoModel vagaDeEstacionamentoModel){
        return vagaDeEstacionamentoRepository.save(vagaDeEstacionamentoModel);
    }


	public List<VagaDeEstacionamentoModel> findAll() {
		return vagaDeEstacionamentoRepository.findAll();
	}

	public Optional<VagaDeEstacionamentoModel> findById(Integer id) {
		// TODO Auto-generated method stub
		return vagaDeEstacionamentoRepository.findById(id);
	}


	public void delete(VagaDeEstacionamentoModel vagaDeEstacionamentoModel) {
		vagaDeEstacionamentoRepository.delete(vagaDeEstacionamentoModel);
		
	}

}
