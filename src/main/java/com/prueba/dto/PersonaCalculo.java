package com.prueba.dto;

import java.util.List;

import lombok.Data;

@Data
public class PersonaCalculo {
	private String nombre;
	private Long edad;
	private String documento;
	private long totalDias;
	private double totalMeses;
	private double totalYears;
	private List<TotalExperiencia> lstTotalExperiencia;
	public PersonaCalculo(String nombre, long edad, String documento, long totalDias, double totalMeses,
			double totalYears, List<TotalExperiencia> lstTotalExperiencia) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.documento = documento;
		this.totalDias = totalDias;
		this.totalMeses = totalMeses;
		this.totalYears = totalYears;
		this.lstTotalExperiencia = lstTotalExperiencia;
	}
	
}
