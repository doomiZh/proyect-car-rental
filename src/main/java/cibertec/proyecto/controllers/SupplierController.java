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

import cibertec.proyecto.models.Supplier;
import cibertec.proyecto.services.CountryService;
import cibertec.proyecto.services.StateService;
import cibertec.proyecto.services.SupplierService;

/**
 * 
 * @author Delta Dev Softaware
 * @version 0.1
 */
@Controller
public class SupplierController {

	/**
	 * supplierService
	 */
	@Autowired
	SupplierService supplierService;
	/**
	 * countryService
	 */
	@Autowired
	CountryService countryService;
	/**
	 * stateService
	 */
	@Autowired
	StateService stateService;

	/**
	 * getSuppliers
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/suppliers")
	public String getSuppliers(Model model) {
		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);

		return "suppliers";
	}

	/**
	 * addSupplier
	 * 
	 * @param supplier
	 * @return
	 */
	@PostMapping("/addsupplier")
	public String addSupplier(Supplier supplier) {
		supplierService.save(supplier);
		return "redirect:/suppliers";
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/supplier/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		List<Supplier> suppliers = supplierService.getSuppliers();
		model.addAttribute("suppliers", suppliers);
		
		Supplier supplier = supplierService.findById(id).get();
		model.addAttribute("supplier", supplier);
		return "editSupplier";
	}

	/**
	 * updateSupplier
	 * 
	 * @param id
	 * @param supplier
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updatesupplier/{id}")
	public String updateSupplier(@PathVariable("id") long id, @Validated Supplier supplier, BindingResult result,
			Model model) {

		supplierService.save(supplier);
		return "redirect:/suppliers";
	}

	/**
	 * deleteSupplier
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/deletesupplier/{id}")
	@Transactional
	public String deleteSupplier(@PathVariable("id") int id) {
		supplierService.delete(id);
		return "redirect:/suppliers";
	}
}
