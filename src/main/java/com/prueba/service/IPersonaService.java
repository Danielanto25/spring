package com.prueba.service;

import java.util.List;

import com.prueba.dto.RespuestaServidor;
import com.prueba.model.Persona;

public interface IPersonaService {
	RespuestaServidor crear(Persona persona);

	List<Persona> listar();

	Persona listarPorCodigo(Integer codigo);

	void update(Persona persona);

	Persona listarPorIdentificacion(String identificacion);
}
