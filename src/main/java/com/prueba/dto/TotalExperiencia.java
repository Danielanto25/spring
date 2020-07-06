package com.prueba.dto;

import lombok.Data;

@Data
public class TotalExperiencia {
	private long dias;
	private float meses;
	private float years;
	private Integer codigo;
	public TotalExperiencia(long dias, float meses, float years,Integer codigo) {
		super();
		this.dias = dias;
		this.meses = meses;
		this.years = years;
		this.codigo=codigo;
	}


}
