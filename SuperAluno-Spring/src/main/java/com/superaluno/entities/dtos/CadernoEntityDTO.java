package com.superaluno.entities.dtos;

import com.superaluno.entities.CadernoEntity;

public class CadernoEntityDTO {
	
	private Long idCaderno;
	private String conteudo;
	private String nomeAssunto;
	
	public CadernoEntityDTO(CadernoEntity cadernoEntity) {
		super();
		this.idCaderno = cadernoEntity.getIdCaderno();
		this.conteudo = cadernoEntity.getConteudo();
		this.setNomeAssunto(cadernoEntity.getAssunto().getNomeAssunto());
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

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}

}
