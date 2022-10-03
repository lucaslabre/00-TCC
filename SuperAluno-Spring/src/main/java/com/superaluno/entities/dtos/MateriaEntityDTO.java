package com.superaluno.entities.dtos;

import com.superaluno.entities.MateriaEntity;

public class MateriaEntityDTO {
	
	private Long idMateria;
	private String nomeMateria;
	
	
	public MateriaEntityDTO(MateriaEntity materiaEntity) {
		this.setIdMateria(materiaEntity.getIdMateria());
		this.setNomeMateria(materiaEntity.getNomeMateria());
	}

	public Long getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(Long idMateria) {
		this.idMateria = idMateria;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

}
