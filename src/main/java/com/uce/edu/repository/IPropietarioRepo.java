package com.uce.edu.repository;

import com.uce.edu.modelo.Propietario;

public interface IPropietarioRepo {

	
	void insertar(Propietario propietario);
	Propietario buscar(String cedula);
	void actualizar(Propietario propietario);
	void eliminar(String cedula);
	
	
	
}
