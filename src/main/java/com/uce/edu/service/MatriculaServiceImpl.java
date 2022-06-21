package com.uce.edu.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Matricula;
import com.uce.edu.repository.IMatriculaRepo;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

	@Autowired
	private IMatriculaRepo matriculaRepo;
	
	@Override
	public void insertarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.insertar(matricula);
	}

	@Override
	public Matricula buscarPorFecha(LocalDateTime fechaMatricula) {
		// TODO Auto-generated method stub
		
		return this.matriculaRepo.buscar(fechaMatricula);
	}

	@Override
	public void actualizarMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		this.matriculaRepo.actualizar(matricula);
	}

	@Override
	public void eliminarPorPlacaVehiculo(String placaVehiculo) {
		// TODO Auto-generated method stub
		this.matriculaRepo.eliminar(placaVehiculo);
	}
	
}
