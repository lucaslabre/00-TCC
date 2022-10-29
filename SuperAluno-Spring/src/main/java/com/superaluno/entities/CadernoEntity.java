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

import com.superaluno.entities.dtos.CadernoEntityDTO;

@Entity
@Table(name = "cadernos")
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
	@JoinColumn(name = "id_usuario")
	private UsuarioEntity usuario;
	
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_assunto")
	private AssuntoEntity assunto;

	
	public CadernoEntity() {
		super();
	}

	public CadernoEntity(Long idCaderno, String conteudo, UsuarioEntity usuario, AssuntoEntity assunto) {
		super();
		this.idCaderno = idCaderno;
		this.conteudo = conteudo;
		this.usuario = usuario;
		this.assunto = assunto;
	}

	public CadernoEntity(CadernoEntityDTO cadernoDTO) {
		this.idCaderno = cadernoDTO.getIdCaderno();
		this.conteudo = cadernoDTO.getConteudo();
		this.setUsuario(new UsuarioEntity(cadernoDTO.getUsuario()));
		this.setAssunto(new AssuntoEntity(cadernoDTO.getAssunto()));
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
