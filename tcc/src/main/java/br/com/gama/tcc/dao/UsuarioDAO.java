package br.com.gama.tcc.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.gama.tcc.model.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
    public Usuario findByRacfAndSenha(String racf, String senha);
}
