package com.prueba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.dto.TotalExperiencia;
import com.prueba.model.ExperienciaLaboral;
import com.prueba.service.IExperienciaLaboralService;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/experiencia-laboral")
public class ExperienciaLaboralController {
	@Autowired
	private IExperienciaLaboralService service;

	@PostMapping(path = "crear")
	public  void crear(@RequestBody ExperienciaLaboral exl) {
		 service.crear(exl);

	}

	@GetMapping(path = "listar")
	public List<ExperienciaLaboral> listar() {
		return service.listar();
	}

	@GetMapping(path = "listar-por-codigo/{codigo}")
	public ExperienciaLaboral listar(@PathVariable Integer codigo) {
		return service.listarPorCodigo(codigo);
	}

	@PutMapping(path = "update")
	public void update(@RequestBody ExperienciaLaboral exl) {
		service.update(exl);
	}

	@GetMapping(path = "listar-por-per-codigo/{codigo}")
	public List<ExperienciaLaboral> listarPorPerCodigo(@PathVariable Integer codigo) {
		return service.listarPorPerCodigo(codigo);
	}
	@GetMapping(path = "listar-por-tit-codigo/{codigo}")
	public List<ExperienciaLaboral> listarPorTitCodigo(@PathVariable Integer codigo) {
		return service.listarPorTitCodigo(codigo);
	}
	@GetMapping(path = "experiencia/{codigo}")
	public TotalExperiencia tiepoexp(@PathVariable Integer codigo) {
		return service.tiempoexp(codigo);
	}
	@GetMapping(path = "experiencia-individual/{codigo}")
	public List<TotalExperiencia> tiempoIndividual(@PathVariable Integer codigo){
		return service.tiempoIndividual(codigo);
	}
}

