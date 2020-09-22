package br.com.gama.tcc.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.tcc.model.Atividade;

public interface AtividadeDAO extends CrudRepository<Atividade, Integer> {
    
}
