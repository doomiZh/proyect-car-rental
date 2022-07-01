package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.services.VehiculeModelService;

@Controller
public class VehicleModelController {

	@Autowired
	private VehiculeModelService vehiculeModelService;

	
	@GetMapping("/vehiculemodels")
	public String getVehicleModelList(Model model)
	{
		List<VehiculoModelo> vehiculemodels=vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculemodels", vehiculemodels);
		return "vehicule_models";
	}
	
}
