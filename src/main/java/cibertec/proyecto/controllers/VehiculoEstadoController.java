package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehiculoEstado;
import cibertec.proyecto.services.VehiculoEstadoService;

@Controller
public class VehiculoEstadoController {

	@Autowired
	private VehiculoEstadoService vehiculeStatusService;

	
	@GetMapping("/vehiculestatus")
	public String getVehiculeStatusList(Model model)
	{
		List<VehiculoEstado> vehiculestatuss = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculestatuss", vehiculestatuss);
		
		return "vehicule_status";
	}
	
}
