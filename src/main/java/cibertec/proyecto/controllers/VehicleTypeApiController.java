package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.vehicule.VehiculeType;
import cibertec.proyecto.services.VehiculeTypeService;

@RestController
public class VehicleTypeApiController {

	@Autowired
	private VehiculeTypeService vehiculeTypeService;

	@GetMapping("/api/vehicle-types")
	public List<VehiculeType> getVehiculeTypeList() {
		return vehiculeTypeService.getVehiculeTypes();
	}
	
}
