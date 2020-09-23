package br.com.gama.tcc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "itmn232_atividade")
public class Atividade {
    
    @Id
    @Column(name="id_atividade")
    private int id_atividade;

    @Column(name = "nome_atividade")
    private String nome_atividade;

    /*@OneToMany(mappedBy = "itmn232_atividade")
    @JsonIgnoreProperties("itmn232_atividade")
    private List<Ocorrencia> ocorrencias;*/

    public int getId_atividade() {
        return id_atividade;
    }

    public void setId_atividade(int id_atividade) {
        this.id_atividade = id_atividade;
    }

    public String getNome_atividade() {
        return nome_atividade;
    }

    public void setNome_atividade(String nome_atividade) {
        this.nome_atividade = nome_atividade;
    }


    
}
