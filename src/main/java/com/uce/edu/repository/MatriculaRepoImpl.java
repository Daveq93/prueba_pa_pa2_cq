package com.uce.edu.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Matricula;

@Repository
public class MatriculaRepoImpl implements IMatriculaRepo{

	List<Matricula> listaM = new ArrayList<>();
	
	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Insertando matricula ");
	}

	@Override
	public Matricula buscar(LocalDateTime fechaMatricula) {
		// TODO Auto-generated method stub
		System.out.println("buscando matricula");
		return listaM.get(listaM.size()-1);
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Actualizando matricula: "+matricula.toString());
	}

	@Override
	public void eliminar(String placaVehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Eliminando matricula ");
	}

}
