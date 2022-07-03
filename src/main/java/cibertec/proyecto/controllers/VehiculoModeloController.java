package cibertec.proyecto.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehiculoModeloController {

	@GetMapping("/vehiculo-modelos")
	public String getVehicleModelList()
	{
		return "vehicule_models";
	}
	
}
