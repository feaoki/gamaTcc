package br.com.gama.tcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.tcc.dao.OcorrenciaDAO;
import br.com.gama.tcc.model.Ocorrencia;
import br.com.gama.tcc.model.Usuario;

@RestController
@CrossOrigin("*")
public class OcorrenciaController {
    
    @Autowired
    private OcorrenciaDAO dao;

    //endpoint 2 backend
    @GetMapping("/ocorrencias")
    public List<Ocorrencia> getMethodName(){
        return (List<Ocorrencia>) dao.findAll();
    }

       
    // endpoint 3 backend
    @GetMapping("/ocorrencias/status/{status}")
    public ResponseEntity<List<Ocorrencia>> buscarOcorrenciaPorStatus(@PathVariable int status){
        List<Ocorrencia> novostatus = dao.buscarOcorrenciaPorStatus(status);
        return ResponseEntity.ok(novostatus);
    } 

    @GetMapping("/ocorrencias/colaborador/{id_usuario}")
    public List<Ocorrencia> buscarColaborador(@PathVariable int id_usuario) {
        Usuario usuario = new Usuario(id_usuario);
        List<Ocorrencia> ocorrencias = dao.findByUsuario(usuario);
        return ocorrencias;
    }

    /*@GetMapping("/ocorrencia/colaborador/{id_usuario}")
    public ResponseEntity<List<Ocorrencia>> buscarOcorrenciaPorColaborador(@PathVariable int id_usuario) {
        List<Ocorrencia> ocorrencias = dao.buscarOcorrenciaPorColaborador(id_usuario);
        return ResponseEntity.ok(ocorrencias);
    }*/




    // endoppint 5  backend
    @GetMapping("/ocorrencias/busca/{num_seq}")
    public ResponseEntity<Ocorrencia> buscarOcorrenciaPorId(@PathVariable int num_seq){
        Ocorrencia busca = dao.buscarOcorrenciaPorId(num_seq);
        return ResponseEntity.ok(busca);
    } 




    // endpoint 6 backend
    @PostMapping("/ocorrencias/atualiza")
    public ResponseEntity<Ocorrencia> postMethodName(@RequestBody Ocorrencia ocorrencia){
        Ocorrencia novaOcorrencia = dao.save(ocorrencia);
        if(novaOcorrencia != null){
            return ResponseEntity.ok(novaOcorrencia);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

}
