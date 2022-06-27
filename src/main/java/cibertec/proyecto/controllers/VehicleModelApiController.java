package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.vehicule.VehicleModel;
import cibertec.proyecto.services.VehiculeModelService;

@RestController
public class VehicleModelApiController {

	@Autowired
	private VehiculeModelService vehiculeModelService;

	
	@GetMapping("/api/vehicle-models")
	public List<VehicleModel> getVehicleModelList()
	{
		return vehiculeModelService.getVehiculeModels();
	}
	
}
