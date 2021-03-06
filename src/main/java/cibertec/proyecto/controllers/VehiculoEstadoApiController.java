package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.VehiculoEstado;
import cibertec.proyecto.services.VehiculoEstadoService;

@RestController
public class VehiculoEstadoApiController {

	@Autowired
	private VehiculoEstadoService vehiculeStatusService;

	
	@GetMapping("/api/vehiculo-estados")
	public List<VehiculoEstado> getVehiculeStatusList() {
		return vehiculeStatusService.getVehicleStatus();
	}
	
}
