package com.prueba.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.model.TipoTrabajo;
import com.prueba.repository.TipoTrabajoRepository;
import com.prueba.service.ITipoTrabajoService;

@Service
public class TipoTrabajoServiceImpl implements ITipoTrabajoService {
	@Autowired
	private TipoTrabajoRepository titRepo;

	@Override
	public void crear(TipoTrabajo tt) {
	
		titRepo.crear(tt);

	}

	@Override
	public List<TipoTrabajo> listar() {

		return titRepo.listar();
	}

	@Override
	public TipoTrabajo listarPorCodigo(Integer codigo) {

		return titRepo.listarPorCodigo(codigo);
	}

	@Override
	public void update(TipoTrabajo tt) {
		titRepo.update(tt);

	}

}
