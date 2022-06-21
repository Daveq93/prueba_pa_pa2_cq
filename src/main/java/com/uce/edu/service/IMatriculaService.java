package com.uce.edu.service;

import java.time.LocalDateTime;

import com.uce.edu.modelo.Matricula;

public interface IMatriculaService {

	void insertarMatricula(Matricula matricula);
	Matricula buscarPorFecha(LocalDateTime fechaMatricula);
	void actualizarMatricula(Matricula matricula);
	void eliminarPorPlacaVehiculo(String placaVehiculo);
}
