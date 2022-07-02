package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.services.VehiculoModeloService;

@Controller
public class VehiculoModeloController {

	@Autowired
	private VehiculoModeloService vehiculoModeloService;

	
	@GetMapping("/vehiculemodels")
	public String getVehicleModelList(Model model)
	{
		List<VehiculoModelo> vehiculemodels=vehiculoModeloService.getVehiculeModels();
		model.addAttribute("vehiculemodels", vehiculemodels);
		return "vehicule_models";
	}
	
}
