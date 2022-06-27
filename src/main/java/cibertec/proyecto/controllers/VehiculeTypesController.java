package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.vehicule.VehiculeType;
import cibertec.proyecto.services.VehiculeTypeService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class VehiculeTypesController {

	/**
	 * vehiculeTypeService
	 */
	@Autowired
	private VehiculeTypeService vehiculeTypeService;

	/**
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculetypes")
	public String getCountries(Model model) {
		List<VehiculeType> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		return "vehicule_types";
	}

}
