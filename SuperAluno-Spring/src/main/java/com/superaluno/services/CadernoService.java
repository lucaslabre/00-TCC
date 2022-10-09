package com.superaluno.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superaluno.entities.CadernoEntity;
import com.superaluno.entities.UsuarioEntity;
import com.superaluno.repositories.CadernoRepository;

@Service
public class CadernoService {
	
	@Autowired
	private CadernoRepository cadernoRepository;
	@Autowired
	private UsuarioService usuarioService;
	
	public List<CadernoEntity> findAllCadernoByUsuario(Long idUsuario) {
		UsuarioEntity usuario = this.usuarioService.findUsuarioByIdUsuario(idUsuario);
		return this.cadernoRepository.findAllCadernoByUsuario(usuario);
	}

}
