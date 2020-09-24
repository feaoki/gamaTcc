package br.com.gama.tcc.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "itmn232_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private int usuario;

    @Column(name = "nome_usuario", length = 100, nullable = false)
    private String nome_usuario;

    @Column(name = "email_usuario", length = 100, nullable = false)
    private String email_usuario;

    @Column(name = "racf", length = 7, nullable = false)
    private String racf;

    @Column(name = "senha", length = 50, nullable = false)
    private String senha;

    @Column(name = "link_foto", length = 255, nullable = false)
    private String link_foto;

    @Column(name = "gestor", nullable = false)
    private int gestor;


    @OneToMany(mappedBy = "usuario") // nome do campo que na classe ocorrencia mapeia essa relação, ou seja, tem que existir na ocorrencia
    @JsonIgnoreProperties("usuario")
    private List<Ocorrencia> ocorrencias;

    public Usuario(){
        
    }



    public String getNome_usuario() {
        return nome_usuario;
    }

    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public String getRacf() {
        return racf;
    }

    public void setRacf(String racf) {
        this.racf = racf;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLink_foto() {
        return link_foto;
    }

    public void setLink_foto(String link_foto) {
        this.link_foto = link_foto;
    }

    public int getGestor() {
        return gestor;
    }

    public void setGestor(int gestor) {
        this.gestor = gestor;
    }

    public List<Ocorrencia> getOcorrencias() {
        return ocorrencias;
    }

    public void setOcorrencias(List<Ocorrencia> ocorrencias) {
        this.ocorrencias = ocorrencias;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

}
