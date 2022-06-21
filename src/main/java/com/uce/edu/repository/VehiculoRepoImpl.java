package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Vehiculo;

@Repository
public class VehiculoRepoImpl implements IVehiculoRepo{
	private List<Vehiculo> listaVehi = new ArrayList<>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Insertando vehiculo Liviano:");
		listaVehi.add( vehiculo);
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return listaVehi.get(listaVehi.size()-1);
	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando vehiculo ");
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando vehiculo por placa "+placa);
	}
}
