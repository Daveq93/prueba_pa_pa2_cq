package com.uce.edu.service;

import com.uce.edu.modelo.Vehiculo;

public interface IVehiculoService {
	void insertarVehiculo(Vehiculo vehiculo);

	Vehiculo buscarPorPlaca(String placa);

	void actualizarVehiculo(Vehiculo vehiculo);

	void eliminarPorPlaca(String placa);
}
