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
	
	public UsuarioEntity findUsuarioByIdUsuario(Long idUsuario) {
		Optional<UsuarioEntity> usuario = this.usuarioRepository.findUsuarioByIdUsuario(idUsuario);
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+idUsuario+", Tipo: "+UsuarioEntity.class.getName()));
	}

	public UsuarioEntity findUsuarioByEmailAndSenha(String email, String senha) {
		Optional<UsuarioEntity> usuario = this.usuarioRepository.findUsuarioByEmailUsuarioAndSenhaUsuario(email, senha);
		return usuario.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Email: "+email+", Tipo: "+UsuarioEntity.class.getName()));
	}

}
