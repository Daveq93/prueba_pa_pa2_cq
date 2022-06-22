package com.uce.edu.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaVehicularService vehiL;
	
	@Autowired
	@Qualifier("pesado")
	private IMatriculaVehicularService vehiP;

	@Override
	public void matricularVehiculo(String cedulaPropietario, String placaVehiculo) {
		// TODO Auto-generated method stub

		Vehiculo v = this.vehiculoService.buscarPorPlaca(placaVehiculo);
		Propietario p = this.propietarioService.buscarPorCedula(cedulaPropietario);

		Matricula m = new Matricula();
		m.setFechaMatricula(LocalDateTime.now());
		m.setPropietario(p);
		BigDecimal valMatricula = null;

		if (v.getTipo().equals("L")) {
			valMatricula = this.vehiL.calcularDescuento(v.getPrecio());	
		}else if (v.getTipo().equals("P")) {
			valMatricula = this.vehiP.calcularDescuento(v.getPrecio());
		}
		
		if(valMatricula.compareTo(new BigDecimal(2000))>0) {
			System.out.println("Aplicando descuento : "+valMatricula);
			BigDecimal valDescuento = valMatricula.multiply(new BigDecimal(0.07));
			valMatricula = valMatricula.subtract(valDescuento);
		}
		
		m.setValorMatricula(valMatricula.setScale(2,RoundingMode.HALF_UP));
		m.setVehiculo(v);
		
		this.matriculaService.insertarMatricula(m);

	}

	

}
