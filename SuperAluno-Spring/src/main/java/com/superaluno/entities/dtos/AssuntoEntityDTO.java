package com.superaluno.entities.dtos;

import com.superaluno.entities.AssuntoEntity;

public class AssuntoEntityDTO {
	
	private Long idAssunto;
	private String nomeAssunto;
	private MateriaEntityDTO materia;
	

	public AssuntoEntityDTO() {
		super();
	}
	
	public AssuntoEntityDTO(AssuntoEntity assuntoEntity) {
		this.setIdAssunto(assuntoEntity.getIdAssunto());
		this.setNomeAssunto(assuntoEntity.getNomeAssunto());
		this.setMateria(new MateriaEntityDTO(assuntoEntity.getMateria()));
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
	
	public MateriaEntityDTO getMateria() {
		return materia;
	}

	public void setMateria(MateriaEntityDTO materia) {
		this.materia = materia;
	}

}
