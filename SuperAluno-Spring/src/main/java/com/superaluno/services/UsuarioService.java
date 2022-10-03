package com.superaluno.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superaluno.entities.UsuarioEntity;
import com.superaluno.repositories.UsuarioRepository;
import com.superaluno.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public UsuarioEntity findById(Long idUsuario) {
		Optional<UsuarioEntity> usuario = this.usuarioRepository.findById(idUsuario);
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+idUsuario+", Tipo: "+UsuarioEntity.class.getName()));
	}

}
