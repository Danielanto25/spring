package com.prueba.service;

import java.util.List;

import com.prueba.dto.TotalExperiencia;
import com.prueba.model.ExperienciaLaboral;

public interface IExperienciaLaboralService {
	 void crear(ExperienciaLaboral exl);
	 List<ExperienciaLaboral> listar();
	 List<ExperienciaLaboral> listarPorPerCodigo(Integer codigo);
	 ExperienciaLaboral listarPorCodigo(Integer codigo);
	 List<ExperienciaLaboral> listarPorTitCodigo(Integer codigo);
	 void update(ExperienciaLaboral exl);
	 TotalExperiencia tiempoexp( Integer codigo);
	 List<TotalExperiencia> tiempoIndividual( Integer codigo);
}
