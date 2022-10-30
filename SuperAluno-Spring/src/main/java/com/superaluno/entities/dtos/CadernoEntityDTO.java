package com.superaluno.entities.dtos;

import com.superaluno.entities.CadernoEntity;

public class CadernoEntityDTO {
	
	private Long idCaderno;
	private String conteudo;
	private Boolean publicado;
	private UsuarioEntityDTO usuario;
	private AssuntoEntityDTO assunto;
	

	public CadernoEntityDTO() {
		super();
	}

	public CadernoEntityDTO(CadernoEntity cadernoEntity) {
		super();
		this.idCaderno = cadernoEntity.getIdCaderno();
		this.conteudo = cadernoEntity.getConteudo();
		this.publicado = cadernoEntity.isPublicado();
		this.setUsuario(new UsuarioEntityDTO(cadernoEntity.getUsuario()));
		this.setAssunto(new AssuntoEntityDTO(cadernoEntity.getAssunto()));
	}

	public Long getIdCaderno() {
		return idCaderno;
	}

	public void setIdCaderno(Long idCaderno) {
		this.idCaderno = idCaderno;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	public Boolean isPublicado() {
		return publicado;
	}

	public void setPublicado(Boolean publicado) {
		this.publicado = publicado;
	}

	public UsuarioEntityDTO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioEntityDTO usuario) {
		this.usuario = usuario;
	}

	public AssuntoEntityDTO getAssunto() {
		return assunto;
	}

	public void setAssunto(AssuntoEntityDTO assunto) {
		this.assunto = assunto;
	}

}
