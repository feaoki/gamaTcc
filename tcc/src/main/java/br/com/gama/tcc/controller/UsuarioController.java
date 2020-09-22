package br.com.gama.tcc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.gama.tcc.dao.UsuarioDAO;
import br.com.gama.tcc.model.Usuario;

@RestController
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioDAO dao;
    
    @PostMapping("/login")
    public ResponseEntity<Usuario> fazerLogin(@RequestBody Usuario user){
        Usuario userEncontrado = dao.findByRacfAndSenha(user.getRacf(), user.getSenha());

        if(userEncontrado != null){
            if(userEncontrado.getSenha().equals(user.getSenha())){
                userEncontrado.setSenha("***********************");
                return ResponseEntity.ok(userEncontrado);
            }
        }
        return ResponseEntity.status(403).build();

    }

}
