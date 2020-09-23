package br.com.gama.tcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.tcc.dao.OcorrenciaDAO;
import br.com.gama.tcc.model.Ocorrencia;

@RestController
@CrossOrigin("*")
public class OcorrenciaController {
    
    @Autowired
    private OcorrenciaDAO dao;

    @GetMapping("/ocorrencias")
    public List<Ocorrencia> getMethodName(){
        return (List<Ocorrencia>) dao.findAll();
    }       
}
