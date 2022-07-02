package cibertec.proyecto.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.models.VehiculoEstado;
import cibertec.proyecto.models.Vehiculo;
import cibertec.proyecto.models.VehiculoTipo;
import cibertec.proyecto.services.VehiculoModeloService;
import cibertec.proyecto.services.VehiculoService;
import cibertec.proyecto.services.VehiculoEstadoService;
import cibertec.proyecto.services.VehiculoTipoService;

@Controller
public class VehiculoController {

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculoService vehiculeService;

	/**
	 * vehiculeTypeService
	 */
	@Autowired
	VehiculoTipoService vehiculeTypeService;

	/**
	 * vehiculeModelService
	 */
	@Autowired
	VehiculoModeloService vehiculeModelService;

	/**
	 * vehiculeStatusService
	 */
	@Autowired
	VehiculoEstadoService vehiculeStatusService;

	/**
	 * getVehicules
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehicules")
	public String getVehicules(Model model) {
		List<Vehiculo> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);
		
		List<VehiculoTipo> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		
		List<VehiculoModelo> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		
		List<VehiculoEstado> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		
		return "vehicules";
	}

	/**
	 * addVehicule
	 * 
	 * @param v
	 * @return
	 */
	@PostMapping("/addvehicule")
	public String addVehicule(Vehiculo v) {
		vehiculeService.save(v);
		return "redirect:/vehicules";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehicule/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		List<VehiculoTipo> vehiculetypes = vehiculeTypeService.getVehiculeTypes();
		model.addAttribute("vehiculetypes", vehiculetypes);
		
		List<VehiculoModelo> vehiculeModels = vehiculeModelService.getVehiculeModels();
		model.addAttribute("vehiculeModels", vehiculeModels);
		
		List<VehiculoEstado> vehiculeStatus = vehiculeStatusService.getVehicleStatus();
		model.addAttribute("vehiculeStatus", vehiculeStatus);
		
		Vehiculo vehicule = vehiculeService.findById(id).get();
		model.addAttribute("vehicule", vehicule);
		
		return "editVehicule";
	}

	/**
	 * updateVehicule
	 * 
	 * @param id
	 * @param vehicule
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehicule/{id}")
	public String updateVehicule(@PathVariable("id") long id, @Validated Vehiculo vehicule, BindingResult result,
			Model model) {

		vehiculeService.save(vehicule);
		return "redirect:/vehicules";
	}

	/**
	 * deleteVehicule
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehicule/{id}")
	@Transactional
	public String deleteVehicule(@PathVariable("id") int id) {
		vehiculeService.deleteById(id);
		return "redirect:/vehicules";
	}
}
