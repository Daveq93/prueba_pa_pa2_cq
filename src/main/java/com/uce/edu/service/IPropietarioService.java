package com.uce.edu.service;

import com.uce.edu.modelo.Propietario;

public interface IPropietarioService {
	void insertarPropietario(Propietario propietario);
	Propietario buscarPorCedula(String cedula);
	void actualizarPropietario(Propietario propietario);
	void eliminarPropietario(String cedula);
}
