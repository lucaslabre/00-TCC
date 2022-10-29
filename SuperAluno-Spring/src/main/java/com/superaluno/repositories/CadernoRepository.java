package com.superaluno.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.superaluno.entities.AssuntoEntity;
import com.superaluno.entities.CadernoEntity;
import com.superaluno.entities.UsuarioEntity;

@Repository
public interface CadernoRepository extends JpaRepository<CadernoEntity, Long> {
	
	List<CadernoEntity> findAllCadernoByUsuario(UsuarioEntity usuario);

	CadernoEntity findCadernoByAssunto(AssuntoEntity assunto);

	CadernoEntity findCadenoByIdCaderno(Long idCaderno);	
	 
}
