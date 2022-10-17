package com.superaluno.entities.dtos;

import com.superaluno.entities.AssuntoEntity;

public class AssuntoEntityDTO {
	
	private Long idAssunto;
	private String nomeAssunto;
	
	public AssuntoEntityDTO() {
		super();
	}
	
	public AssuntoEntityDTO(AssuntoEntity assuntoEntity) {
		this.setIdAssunto(assuntoEntity.getIdAssunto());
		this.setNomeAssunto(assuntoEntity.getNomeAssunto());
	}

	public AssuntoEntityDTO(Long idAssunto, String nomeAssunto) {
		super();
		this.idAssunto = idAssunto;
		this.nomeAssunto = nomeAssunto;
	}

	public Long getIdAssunto() {
		return idAssunto;
	}

	public void setIdAssunto(Long idAssunto) {
		this.idAssunto = idAssunto;
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}

}
