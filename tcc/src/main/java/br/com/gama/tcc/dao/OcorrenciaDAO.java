package br.com.gama.tcc.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.tcc.model.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia,Integer> {
    
}
