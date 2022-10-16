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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "assuntos")
public class AssuntoEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_assunto")
	private Long idAssunto;
	
	@Column(name = "nome_assunto")
	private String nomeAssunto;
	
	@ManyToOne(fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
	@JoinColumn(name = "id_materia")
	private MateriaEntity materia;
	
	@OneToMany(mappedBy = "idCaderno" , fetch = FetchType.EAGER,  cascade=CascadeType.ALL)
	private Set<CadernoEntity> cadernos;

	
	public AssuntoEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AssuntoEntity(Long idAssunto, String nomeAssunto, MateriaEntity materia, Set<CadernoEntity> cadernos) {
		super();
		this.idAssunto = idAssunto;
		this.nomeAssunto = nomeAssunto;
		this.materia = materia;
		this.cadernos = cadernos;
	}

	public String getNomeAssunto() {
		return nomeAssunto;
	}

	public void setNomeAssunto(String nomeAssunto) {
		this.nomeAssunto = nomeAssunto;
	}

	public MateriaEntity getMateria() {
		return materia;
	}

	public void setMateria(MateriaEntity materia) {
		this.materia = materia;
	}

	public Set<CadernoEntity> getCadernos() {
		return cadernos;
	}

	public void setCadernos(Set<CadernoEntity> cadernos) {
		this.cadernos = cadernos;
	}

	public Long getIdAssunto() {
		return idAssunto;
	}
	
}
