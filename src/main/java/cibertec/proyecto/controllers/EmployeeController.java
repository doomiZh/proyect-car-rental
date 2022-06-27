package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cibertec.proyecto.models.person.Employee;
import cibertec.proyecto.services.EmployeeService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class EmployeeController {

	/**
	 * employeeService
	 */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * getEmployees
	 * @param model
	 * @return
	 */
	@GetMapping("/employees")
	public String getEmployees(Model model) {
		List<Employee> employees = employeeService.getEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}

	/**
	 * addCountry
	 * @param e
	 * @return
	 */
	@PostMapping("/addemployee")
	public String addCountry(Employee e) {
		employeeService.save(e);
		return "redirect:/employee";
	}

}
