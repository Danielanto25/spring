package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dto.RespuestaServidor;
import com.prueba.model.Persona;
import com.prueba.repository.PersonaRepository;
import com.prueba.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {
	@Autowired
	private PersonaRepository perRepo;

	@Override
	public RespuestaServidor crear(Persona persona) {
		if(perRepo.listarPorIdentificacion(persona.getIdentificacion())==null) {
			
			perRepo.crear(persona);
			return new RespuestaServidor("La persona fue creada correctamente",1);
		}else {
			return new RespuestaServidor("Persona Ya existe",2);
		}
		
	}


	@Override
	public List<Persona> listar() {

		return perRepo.listar();
	}

	@Override
	public Persona listarPorCodigo(Integer codigo) {

		return perRepo.listarPorCodigo(codigo);
	}

	@Override
	public void update(Persona persona) {
		perRepo.update(persona);

	}

	@Override
	public Persona listarPorIdentificacion(String identificacion) {

		return perRepo.listarPorIdentificacion(identificacion);
	}

}
