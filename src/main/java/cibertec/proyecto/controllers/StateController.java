package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cibertec.proyecto.models.country.Country;
import cibertec.proyecto.models.country.State;
import cibertec.proyecto.services.CountryService;
import cibertec.proyecto.services.StateService;

/**
 * 
 * @author Grupo 4
 * @version 1.0
 */
@Controller
public class StateController {

	/**
	 * stateService
	 */
	@Autowired
	private StateService stateService;

	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	/**
	 * getStates
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/states")
	public String getStates(Model model) {
		List<cibertec.proyecto.models.country.State> states = stateService.getStates();
		model.addAttribute("states", states);
		List<Country> countries = countryService.getCountries();
		model.addAttribute("countries", countries);

		return "state";
	}

	/**
	 * addState
	 * 
	 * @param state
	 * @return
	 */
	@PostMapping("/addstate")
	public String addState(State state) {
		stateService.save(state);
		return "redirect:/states";
	}
}
