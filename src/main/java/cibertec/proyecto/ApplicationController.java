package cibertec.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.services.ClienteService;
import cibertec.proyecto.services.VehiculoService;

/**
 * ApplicationController
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class ApplicationController {

	/**
	 * @ ClientService
	 */
	@Autowired
	ClienteService clientService;

	/**
	 * vehiculeService
	 */
	@Autowired
	VehiculoService vehiculeService;

	/**
	 * index: redirect to index page
	 * 
	 * @param model
	 * @return index page
	 */
	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("client_nb", clientService.getCount());
		model.addAttribute("vehicle_nb", vehiculeService.getCount());
		return "index";
	}

	/**
	 * login : redirects to login page
	 * 
	 * @return login page
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * logout : redirects to logout page
	 * 
	 * @return logout page
	 */
	@GetMapping("/logout")
	public String logout() {
		return "login";
	}

	/**
	 * register : redirects to register page
	 * 
	 * @return register page
	 */
	@GetMapping("/register")
	public String register() {
		return "register";
	}
}
