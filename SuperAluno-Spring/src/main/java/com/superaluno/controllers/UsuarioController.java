package com.superaluno.controllers;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.superaluno.entities.UsuarioEntity;
import com.superaluno.entities.dtos.UsuarioEntityDTO;
import com.superaluno.services.UsuarioService;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/{idUsuario}")
	public UsuarioEntityDTO findUsuarioByIdUsuario(@PathVariable Long idUsuario) {
		UsuarioEntity usuario = usuarioService.findUsuarioByIdUsuario(idUsuario);
		return new UsuarioEntityDTO(usuario);
	}
	
	@GetMapping("/validar")
	public UsuarioEntityDTO findUsuarioByEmailAndSenha(@PathParam(value = "email") String email, @PathParam(value = "senha") String senha) {
		UsuarioEntity usuario = usuarioService.findUsuarioByEmailAndSenha(email, senha);
		return new UsuarioEntityDTO(usuario);
	}

}
