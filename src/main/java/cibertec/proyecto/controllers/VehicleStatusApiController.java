package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.VehicleStatus;
import cibertec.proyecto.services.VehiculeStatusService;

@RestController
public class VehicleStatusApiController {

	@Autowired
	private VehiculeStatusService vehiculeStatusService;

	
	@GetMapping("/api/vehicle-statuses")
	public List<VehicleStatus> getVehiculeStatusList() {
		return vehiculeStatusService.getVehicleStatus();
	}
	
}
