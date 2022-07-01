package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehicleStatus;
import cibertec.proyecto.services.VehiculeStatusService;

@Controller
public class VehicleStatusController {

	@Autowired
	private VehiculeStatusService vehiculeStatusService;

	
	@GetMapping("/vehiculestatus")
	public String getVehiculeStatusList(Model model)
	{
		List<VehicleStatus> vehiculestatuss = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculestatuss", vehiculestatuss);
		
		return "vehicule_status";
	}
	
}
