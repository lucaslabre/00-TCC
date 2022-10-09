package com.superaluno.entities.dtos;

import com.superaluno.entities.UsuarioEntity;

public class UsuarioEntityDTO {
	
	private Long idUsuario;
	private String nomeUsuario;
	private String emailUsuario;
	private String cpfUsuario;
	
	
	public UsuarioEntityDTO(UsuarioEntity usuarioEntity) {
		super();
		this.idUsuario = usuarioEntity.getIdUsuario();
		this.nomeUsuario = usuarioEntity.getNomeUsuario();
		this.emailUsuario = usuarioEntity.getEmailUsuario();
		this.cpfUsuario = usuarioEntity.getCpfUsuario();
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getCpfUsuario() {
		return cpfUsuario;
	}

	public void setCpfUsuario(String cpfUsuario) {
		this.cpfUsuario = cpfUsuario;
	}

}
