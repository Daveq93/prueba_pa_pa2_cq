package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.repository.IVehiculoRepo;

@Service
public class VehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepo vehiRepo;


	@Override
	public void insertarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.vehiRepo.insertar(vehiculo);

	}

	@Override
	public Vehiculo buscarPorPlaca(String placa) {

		Vehiculo v = this.vehiRepo.buscar(placa);

		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public void actualizarVehiculo(Vehiculo vehiculo) {
		// TODO Auto-generated method stub

		this.vehiRepo.actualizar(vehiculo);

	}

	@Override
	public void eliminarPorPlaca(String placa) {
		// TODO Auto-generated method stub

		this.vehiRepo.eliminar(placa);

	}

}
