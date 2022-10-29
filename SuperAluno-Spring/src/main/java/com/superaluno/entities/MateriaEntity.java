package com.superaluno.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.superaluno.entities.dtos.MateriaEntityDTO;

@Entity
@Table(name = "materias")
public class MateriaEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_materia")
	private Long idMateria;
	
	@Column(name = "nome_materia")
	@Length(max = 100)
	private String nomeMateria;
	
	@OneToMany(mappedBy = "idAssunto", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<AssuntoEntity> assuntos;

	
	public MateriaEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MateriaEntity(Long idMateria, @Length(max = 100) String nomeMateria, Set<AssuntoEntity> assuntos) {
		super();
		this.idMateria = idMateria;
		this.nomeMateria = nomeMateria;
		this.assuntos = assuntos;
	}

	public MateriaEntity(MateriaEntityDTO materiaDTO) {
		this.idMateria = materiaDTO.getIdMateria();
		this.nomeMateria = materiaDTO.getNomeMateria();
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public Set<AssuntoEntity> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(Set<AssuntoEntity> assuntos) {
		this.assuntos = assuntos;
	}

	public Long getIdMateria() {
		return idMateria;
	}

}
