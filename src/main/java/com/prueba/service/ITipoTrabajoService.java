package com.prueba.service;

import java.util.List;

import com.prueba.model.TipoTrabajo;

public interface ITipoTrabajoService {
	void crear(TipoTrabajo tt);

	List<TipoTrabajo> listar();

	TipoTrabajo listarPorCodigo(Integer codigo);

	void update(TipoTrabajo tt);
}
