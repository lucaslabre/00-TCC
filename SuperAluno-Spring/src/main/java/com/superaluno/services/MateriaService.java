package com.superaluno.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.superaluno.entities.MateriaEntity;
import com.superaluno.entities.UsuarioEntity;
import com.superaluno.entities.dtos.MateriaEntityDTO;
import com.superaluno.repositories.MateriaRepository;
import com.superaluno.services.exceptions.ObjectNotFoundException;

@Service
public class MateriaService {
	
	@Autowired
	private MateriaRepository materiaRepository;
	
	public MateriaEntity findMateriaByIdMateria(Long idMateria) {
		Optional<MateriaEntity> materia = this.materiaRepository.findMateriaByIdMateria(idMateria);
		return materia.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: "+idMateria+", Tipo: "+UsuarioEntity.class.getName()));
	}

	public MateriaEntity createMateria(MateriaEntityDTO materiaDTO) {
		MateriaEntity materia = new MateriaEntity(materiaDTO);
		return this.materiaRepository.save(materia);
	}

}
