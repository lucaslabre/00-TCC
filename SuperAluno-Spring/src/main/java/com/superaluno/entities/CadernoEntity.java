package com.superaluno.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "caderno")
public class CadernoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_caderno")
	private Long idCaderno;
	
	@Column(name = "conteudo")
	@Lob  // Annotation to generate the "text" type in the database
	private String conteudo;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idUsuario")
	private UsuarioEntity usuario;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "idAssunto")
	private AssuntoEntity assunto;

	
	public CadernoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CadernoEntity(Long idCaderno, String conteudo, UsuarioEntity usuario, AssuntoEntity assunto) {
		super();
		this.idCaderno = idCaderno;
		this.conteudo = conteudo;
		this.usuario = usuario;
		this.assunto = assunto;
	}

	public Long getIdCaderno() {
		return idCaderno;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public UsuarioEntity getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntity usuario) {
		this.usuario = usuario;
	}

	public AssuntoEntity getAssunto() {
		return assunto;
	}

	public void setAssunto(AssuntoEntity assunto) {
		this.assunto = assunto;
	}

}
