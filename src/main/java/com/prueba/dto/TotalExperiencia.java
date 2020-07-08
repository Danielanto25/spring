package com.prueba.dto;

import lombok.Data;

@Data
public class TotalExperiencia {
	
	private long dias;
	private double meses;
	private double years;
	private String nombreTrabajo;

	public TotalExperiencia(long dias, Double meses, Double years, String nombreTrabajo) {
		super();
		this.dias = dias;
		this.meses = meses;
		this.years = years;
		this.nombreTrabajo = nombreTrabajo;
	}

}
