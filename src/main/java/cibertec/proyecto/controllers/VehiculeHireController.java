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

import cibertec.proyecto.models.client.Client;
import cibertec.proyecto.models.country.Location;
import cibertec.proyecto.models.vehicule.Vehicule;
import cibertec.proyecto.models.vehicule.VehiculeHire;
import cibertec.proyecto.services.ClientService;
import cibertec.proyecto.services.LocationService;
import cibertec.proyecto.services.VehiculeHireService;
import cibertec.proyecto.services.VehiculeService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 *
 */
@Controller
public class VehiculeHireController {

	/**
	 * vehiculeHireService
	 */
	@Autowired
	private VehiculeHireService vehiculeHireService;

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculeService vehiculeService;

	/**
	 * clientService
	 */
	@Autowired
	ClientService clientService;

	/**
	 * locationService
	 */
	@Autowired
	LocationService locationService;

	/**
	 * getVehicules
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculehire")
	public String getVehicules(Model model) {
		List<VehiculeHire> vehiculehires = vehiculeHireService.getVehiculeHires();
		model.addAttribute("vehiculehires", vehiculehires);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		List<Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);

		return "vehicule_hires";
	}

	/**
	 * addVehiculeHire
	 * 
	 * @param vehiculeHire
	 * @return
	 */
	@PostMapping("/addvehiculehire")
	public String addVehiculeHire(VehiculeHire vehiculeHire) {
		vehiculeHireService.save(vehiculeHire);
		return "redirect:/vehiculehire";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehiculehire/{id}")
	public String findById(@PathVariable("id") int id, Model model) {

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		List<Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);

		VehiculeHire vehiculeHire = vehiculeHireService.findById(id).get();
		model.addAttribute("vehiculeHire", vehiculeHire);
		return "editHire";
	}

	/**
	 * updateVehiculeHire
	 * 
	 * @param id
	 * @param vehicule
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehiculehire/{id}")
	public String updateVehiculeHire(@PathVariable("id") long id, @Validated VehiculeHire vehicule,
			BindingResult result, Model model) {

		vehiculeHireService.save(vehicule);
		return "redirect:/vehiculeshire";
	}

	/**
	 * deleteVehiculeHire
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehiculehire/{id}")
	@Transactional
	public String deleteVehiculeHire(@PathVariable("id") int id) {
		vehiculeHireService.delete(id);
		return "redirect:/vehiculehire";
	}
}