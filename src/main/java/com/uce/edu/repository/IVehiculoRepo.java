package com.uce.edu.repository;

import java.math.BigDecimal;

import com.uce.edu.modelo.Vehiculo;

public interface IVehiculoRepo {
	
	
	void insertar(Vehiculo vehiculo);
	Vehiculo buscar(String placa);
	void actualizar(Vehiculo vehiculo);
	void eliminar(String placa);	
	
}
