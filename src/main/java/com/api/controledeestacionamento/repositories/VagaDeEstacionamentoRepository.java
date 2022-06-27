package com.api.controledeestacionamento.repositories;

import com.api.controledeestacionamento.models.VagaDeEstacionamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VagaDeEstacionamentoRepository extends JpaRepository<VagaDeEstacionamentoModel, Integer> {


}
