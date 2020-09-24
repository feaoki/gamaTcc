package br.com.gama.tcc.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "itmn232_ocorrencia")
public class Ocorrencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="num_seq")
    private int num_seq;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_oc")
    @JsonFormat(pattern = "dd/mm/YYYY HH:mm")
    private LocalDate data_oc;
    //private LocalDate data_oc = LocalDate.now();

    @Column(name = "num_horas")
    @JsonFormat(pattern = "HH:mm")
    private LocalTime num_horas;
    //private LocalTime num_horas = LocalTime.now();

    @Column(name = "ponto_manual")    
    private int ponto_manual;

    @Column(name = "status")
    private int status;

    @ManyToOne
    @JoinColumn(name = "id_atividade")
    @JsonIgnoreProperties("ocorrencias")
    private Atividade atividade;

    @ManyToOne
    @JoinColumn(name = "id_usuario")
    @JsonIgnoreProperties("ocorrencias")
    private Usuario usuario;

    public int getNum_seq() {
        return num_seq;
    }

    public void setNum_seq(int num_seq) {
        this.num_seq = num_seq;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData_oc() {
        return data_oc;
    }

    public void setData_oc(LocalDate data_oc) {
        this.data_oc = data_oc;
    }

    public LocalTime getNum_horas() {
        return num_horas;
    }

    public void setNum_horas(LocalTime num_horas) {
        this.num_horas = num_horas;
    }

    public int getPonto_manual() {
        return ponto_manual;
    }

    public void setPonto_manual(int ponto_manual) {
        this.ponto_manual = ponto_manual;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

	public Atividade getAtividade() {
		return atividade;
	}

	public void setAtividade(Atividade atividade) {
		this.atividade = atividade;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    
}
