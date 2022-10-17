package com.superaluno.entities.dtos;

import com.superaluno.entities.CadernoEntity;

public class CadernoEntityDTO {
	
	private Long idCaderno;
	private String conteudo;
	private AssuntoEntityDTO assunto;


	public CadernoEntityDTO(CadernoEntity cadernoEntity) {
		super();
		this.idCaderno = cadernoEntity.getIdCaderno();
		this.conteudo = cadernoEntity.getConteudo();
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

	public AssuntoEntityDTO getAssunto() {
		return assunto;
	}

	public void setAssunto(AssuntoEntityDTO assunto) {
		this.assunto = assunto;
	}

}
