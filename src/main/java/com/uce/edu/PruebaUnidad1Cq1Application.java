package com.uce.edu;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.modelo.Propietario;
import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.service.IGestorMatriculaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.IVehiculoService;

@SpringBootApplication
public class PruebaUnidad1Cq1Application implements CommandLineRunner{
	
	@Autowired
	private IVehiculoService vehiculoService;
	
	@Autowired
	private IPropietarioService propietarioService;
	
	@Autowired
	private IGestorMatriculaService gestorService;
	

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad1Cq1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Vehiculo v = new Vehiculo();
		v.setMarca("Chevrolet");
		v.setPlaca("AXS-2541");
		v.setPrecio(new BigDecimal(20500));
		v.setTipo("L");

		this.vehiculoService.insertarVehiculo(v);
		
		
		Vehiculo vActalizado = new Vehiculo();
		vActalizado.setMarca("Chevrolet");
		vActalizado.setPlaca("AXS-2001");
		vActalizado.setPrecio(new BigDecimal(20510));
		vActalizado.setTipo("L");
		
		this.vehiculoService.actualizarVehiculo(vActalizado);
		
		
		Propietario p1 = new Propietario();
		p1.setApellido("Quizhpe");
		p1.setCedula("1212121212");
		p1.setFechaNacimiento(LocalDateTime.of(2000, Month.APRIL,15,0,0));
		p1.setNombre("Cristian");
		
		this.propietarioService.insertarPropietario(p1);
		
		
		
		this.gestorService.matricularVehiculo("1212121212", "AXS-2001");
		
		
	}

}
