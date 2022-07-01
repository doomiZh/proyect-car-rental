package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehiculeType;
import cibertec.proyecto.services.VehiculeTypeService;

@Controller
public class VehicleTypeController {

	@Autowired
	private VehiculeTypeService vehiculeTypeService;

	
	@GetMapping("/vehiculetypes")
	public String getVehiculeTypeList(Model model) {
		
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		
		return "vehicule_types";
	}

}
