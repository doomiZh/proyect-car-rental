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

import cibertec.proyecto.models.client.Supplier;
import cibertec.proyecto.models.vehicule.Vehicule;
import cibertec.proyecto.models.vehicule.VehiculeMaintenance;
import cibertec.proyecto.services.SupplierService;
import cibertec.proyecto.services.VehiculeMaintenanceService;
import cibertec.proyecto.services.VehiculeService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class VehiculeMaintenanceController {

	/**
	 * vehiculeMaintenanceService
	 */
	@Autowired
	VehiculeMaintenanceService vehiculeMaintenanceService;

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculeService vehiculeService;

	/**
	 * supplierService
	 */
	@Autowired
	SupplierService supplierService;

	/**
	 * getVehiculeMaintenances
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/vehiculemaintenance")
	public String getVehiculeMaintenances(Model model) {
		List<VehiculeMaintenance> vehiculeMaintenances = vehiculeMaintenanceService.getVehiculeMaintenances();
		model.addAttribute("vehiculeMaintenances", vehiculeMaintenances);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);

		return "vehicule_maintenance";
	}

	/**
	 * addVehiculeMaintenance
	 * 
	 * @param vehiculeMaintenance
	 * @return
	 */
	@PostMapping("/addvehiculemaintenance")
	public String addVehiculeMaintenance(VehiculeMaintenance vehiculeMaintenance) {
		vehiculeMaintenanceService.save(vehiculeMaintenance);
		return "redirect:/vehiculemaintenance";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/vehiculemaintenance/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		VehiculeMaintenance vehiculeMaintenance = vehiculeMaintenanceService.findById(id).get();
		model.addAttribute("vehiculeMaintenance", vehiculeMaintenance);

		List<Vehicule> vehicules = vehiculeService.getVehicules();
		model.addAttribute("vehicules", vehicules);

		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);
		return "editMaintenance";
	}

	/**
	 * updateVehiculeMaintenance
	 * 
	 * @param id
	 * @param vehicule
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatevehiculemaintenance/{id}")
	public String updateVehiculeMaintenance(@PathVariable("id") long id, @Validated VehiculeMaintenance vehicule,
			BindingResult result, Model model) {

		vehiculeMaintenanceService.save(vehicule);
		return "redirect:/vehiculemaintenance";
	}

	/**
	 * deleteVehiculeMaintenance
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletevehiculemaintenance/{id}")
	@Transactional
	public String deleteVehiculeMaintenance(@PathVariable("id") int id) {
		vehiculeMaintenanceService.delete(id);
		return "redirect:/vehiculemaintenance";
	}
}
