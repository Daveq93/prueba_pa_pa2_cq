package com.uce.edu.repository;

import java.time.LocalDateTime;

import com.uce.edu.modelo.Matricula;

public interface IMatriculaRepo {

	
	void insertar(Matricula matricula);
	Matricula buscar(LocalDateTime fechaMatricula);
	void actualizar(Matricula matricula);
	void eliminar(String placaVehiculo);
}
