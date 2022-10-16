package com.superaluno.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipo_usuario")
public class TipoUsuario {
	
	@Id
	@Column(name = "id_tipo_usuario")
	private Integer idTipoUsuario;
	
	@Column(name = "tipo_usuario")
	private String tipoUsuario;
	
	@OneToMany(mappedBy = "tipoUsuario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<UsuarioEntity> usuarios;

	
	public TipoUsuario() {
		super();
	}

	public TipoUsuario(Integer idTipoUsuario, String tipoUsuario) {
		super();
		this.idTipoUsuario = idTipoUsuario;
		this.tipoUsuario = tipoUsuario;
	}

	public Integer getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(Integer idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
