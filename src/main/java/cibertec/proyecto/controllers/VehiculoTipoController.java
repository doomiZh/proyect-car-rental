package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.VehiculoTipo;
import cibertec.proyecto.services.VehiculoTipoService;

@Controller
public class VehiculoTipoController {

	@Autowired
	private VehiculoTipoService vehiculeTypeService;

	
	@GetMapping("/vehiculos-tipos")
	public String getVehiculeTypeList(Model model) {
		
		List<VehiculoTipo> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		
		return "vehicule_types";
	}

}
