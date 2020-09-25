package br.com.gama.tcc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.com.gama.tcc.model.Ocorrencia;
import br.com.gama.tcc.model.Usuario;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia,Integer> {


    @Query(value = "select o from Ocorrencia o Where o.status = :status")
    public List<Ocorrencia> buscarOcorrenciaPorStatus(@Param("status") Integer status);


    //@Query(value = "select o from Ocorrencia o Where o.id_usuario = :id_usuario")
    //public List<Ocorrencia> buscarOcorrenciaPorColaborador(@Param("id_usuario") Integer id_usuario);


    @Query(value = "select o from Ocorrencia o Where o.num_seq = :num_seq")
    public Ocorrencia buscarOcorrenciaPorId(@Param("num_seq") Integer num_seq);

    public List<Ocorrencia> findByUsuario(Usuario usuario);

}
