package com.prueba.service.impl;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.dto.TotalExperiencia;
import com.prueba.model.ExperienciaLaboral;
import com.prueba.repository.ExperienciaLaboralRepository;
import com.prueba.service.IExperienciaLaboralService;

@Service
public class ExperienciaLaboralServiceImpl implements IExperienciaLaboralService {
	@Autowired
	private ExperienciaLaboralRepository exlRepo;

	@Override
	public void crear(ExperienciaLaboral exl) {
		exlRepo.crear(exl);
	}

	@Override
	public List<ExperienciaLaboral> listar() {

		return exlRepo.listar();
	}

	@Override
	public List<ExperienciaLaboral> listarPorPerCodigo(Integer codigo) {

		return exlRepo.listarPorPerCodigo(codigo);
	}

	@Override
	public ExperienciaLaboral listarPorCodigo(Integer codigo) {

		return exlRepo.listarPorCodigo(codigo);
	}

	@Override
	public List<ExperienciaLaboral> listarPorTitCodigo(Integer codigo) {

		return exlRepo.listarPorTitCodigo(codigo);
	}

	@Override
	public void update(ExperienciaLaboral exl) {
		exlRepo.update(exl);

	}

	@Override
	public TotalExperiencia tiempoexp(Integer codigo) {
		long days=0;
		float year=0,mes=0;
		for (ExperienciaLaboral exp : exlRepo.listarPorPerCodigo(codigo)) {
			days=ChronoUnit.DAYS.between(exp.getFechaInicio(),exp.getFechaFin())+days;
			
		}
		mes=days/30;
		year=mes/12;
		return new TotalExperiencia( days,mes,year,codigo);
	}

	@Override
	public List<TotalExperiencia> tiempoIndividual(Integer codigo) {
		List<TotalExperiencia> lstTotalexp=new ArrayList<TotalExperiencia>();
		TotalExperiencia txp=null;
		for (ExperienciaLaboral exp : exlRepo.listarPorPerCodigo(codigo)) {
			txp=new TotalExperiencia(ChronoUnit.DAYS.between(exp.getFechaInicio(),exp.getFechaFin()),ChronoUnit.MONTHS.between(exp.getFechaInicio(),exp.getFechaFin()),ChronoUnit.YEARS.between(exp.getFechaInicio(),exp.getFechaFin()),exp.getCodigo());	
			lstTotalexp.add(txp);
		}
		
		return lstTotalexp;
	}

}
