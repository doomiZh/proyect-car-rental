package cibertec.proyecto.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.services.EmployeeTypesService;


/**
 * EmployeeTypeController
 * @author Grupo 4
 *
 */
@Controller
public class EmployeeTypeController {

	
    /**
     * employeeTypeService
     */
	@Autowired
	private EmployeeTypesService employeeTypeService;
	
	/**
	 * getEmployeeTypes
	 * @param model
	 * @return
	 */
	@GetMapping("/employeetypes")
	public String getEmployeeTypes(Model model)
	{
		List<cibertec.proyecto.models.person.EmployeeType> employeetypes=employeeTypeService.getEmployeeTypess();
		model.addAttribute("employeetypes", employeetypes);
		return "employee_type";
	}
}
