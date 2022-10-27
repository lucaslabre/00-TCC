package com.superaluno.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superaluno.entities.AssuntoEntity;
import com.superaluno.repositories.AssuntoRepository;

@Service
public class AssuntoService {
	
	@Autowired
	private AssuntoRepository assuntoRepository;
	
	public AssuntoEntity findAssuntoByIdAssunto(Long idAssunto) {
		return this.assuntoRepository.findByIdAssunto(idAssunto);
	}

}
