package br.com.gama.tcc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.tcc.dao.AtividadeDAO;
import br.com.gama.tcc.model.Atividade;

@RestController
@CrossOrigin("*")
public class AtividadeController {
    
    @Autowired
    private AtividadeDAO dao;

    // endpoint 4 backend
    @GetMapping("/atividades")
    public List<Atividade> getMethodName(){
        return (List<Atividade>) dao.findAll();
    }    

}
