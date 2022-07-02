package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.services.VehiculoModeloService;

@RestController
public class VehiculoModeloApiController {

	@Autowired
	private VehiculoModeloService vehiculoModeloService;

	
	@GetMapping("/api/vehiculo-modelos")
	public List<VehiculoModelo> getVehicleModelList()
	{
		return vehiculoModeloService.getVehiculeModels();
	}
	
}
