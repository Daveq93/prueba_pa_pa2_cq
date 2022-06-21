package com.uce.edu.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Propietario;

@Repository
public class PropietarioRepoImpl implements IPropietarioRepo {

	
	
	@Override
	public void insertar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Insertando propietario en DB: "+propietario.getNombre()+ " - "+propietario.getApellido());
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		Propietario p = new Propietario();
		p.setApellido("Quizhpe");
		p.setCedula("1221212121");
		p.setFechaNacimiento(LocalDateTime.now());
		p.setNombre("Cristian");
		
		return p;
	}

	@Override
	public void actualizar(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando propietario: "+propietario.toString());
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		//aqui puedo usar el mismo metodo de esta clase para buscar el propietario y proceder a eliminar
		
		//Propietario p = this.buscar(String cedula);
		
		System.out.println("Eliminando por cedula: "+cedula );
	}

}
