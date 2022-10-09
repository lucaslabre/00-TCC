package com.superaluno.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.superaluno.entities.UsuarioEntity;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	
	Optional<UsuarioEntity> findUsuarioByIdUsuario(Long idUsuario);

	Optional<UsuarioEntity> findUsuarioByEmailUsuarioAndSenhaUsuario(String email, String senha);

}
