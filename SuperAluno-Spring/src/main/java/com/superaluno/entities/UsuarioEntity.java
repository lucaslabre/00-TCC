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


@Entity
@Table(name = "aluno")
public class UsuarioEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_aluno")
	private Long idUsuario;
	
	@Column(name = "nome_aluno")
	private String nomeUsuario;
	
	@Column(name = "email_aluno")
	@Length(max = 60)
	private String emailUsuario;
	
	@Column(name = "cpf_aluno", length = 11)
	private String cpfUsuario;
	
	@Column(name = "senha_aluno", nullable = false)
	@Length(min = 3, max = 20)
	private String senhaUsuario;
	
	@OneToMany(mappedBy = "idCaderno", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Set<CadernoEntity> cadernos;
	

	public UsuarioEntity() {
		super();
	}

	public UsuarioEntity(Long idUsuario, String nomeUsuario, @Length(max = 60) String emailUsuario, String cpfUsuario,
			@Length(min = 3, max = 20) String senhaUsuario, Set<CadernoEntity> cadernos) {
		super();
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.emailUsuario = emailUsuario;
		this.cpfUsuario = cpfUsuario;
		this.senhaUsuario = senhaUsuario;
		this.cadernos = cadernos;
	}

	public Long getIdUsuario() {
		return idUsuario;
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

	public String getSenhaUsuario() {
		return senhaUsuario;
	}

	public void setSenhaUsuario(String senhaUsuario) {
		this.senhaUsuario = senhaUsuario;
	}

	public Set<CadernoEntity> getCadernos() {
		return cadernos;
	}

	public void setCadernos(Set<CadernoEntity> cadernos) {
		this.cadernos = cadernos;
	}

}
