package com.uce.edu.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Matricula;
import com.uce.edu.modelo.Propietario;
import com.uce.edu.modelo.Vehiculo;

@Service
public class GestorMatriculaServiceImpl implements IGestorMatriculaService {

	@Autowired
	private IPropietarioService propietarioService;

	@Autowired
	private IVehiculoService vehiculoService;

	@Autowired
	private IMatriculaService matriculaService;

	@Override
	public void matricularVehiculo(String cedulaPropietario, String placaVehiculo) {
		// TODO Auto-generated method stub

		Vehiculo v = this.vehiculoService.buscarPorPlaca(placaVehiculo);

		Propietario p = this.propietarioService.buscarPorCedula(cedulaPropietario);

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(p);

		if (v.getTipo().equals("L")) {

			BigDecimal val1 = v.getPrecio().multiply(new BigDecimal(0.10));

			BigDecimal valm = val1.subtract(this.verificarValor(val1));

			m.setValorMatricula(valm.setScale(2, RoundingMode.HALF_UP));
		}
		if (v.getTipo().equals("P")) {
			BigDecimal val1 = v.getPrecio().multiply(new BigDecimal(0.15));

			BigDecimal valm = val1.subtract(this.verificarValor(val1));

			m.setValorMatricula(valm.setScale(2, RoundingMode.HALF_UP));
		}
		
		m.setVehiculo(v);
		
		this.matriculaService.actualizarMatricula(m);

	}

	private BigDecimal verificarValor(BigDecimal valorMatricula) {

		BigDecimal val1 = new BigDecimal(0);

		if (valorMatricula.compareTo(new BigDecimal(2000)) > 0) {
			System.out.println("Aplicando descuento ");

			return valorMatricula.multiply(new BigDecimal(0.7));
		} else {
			return val1;
		}

	}

}
