package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import cibertec.proyecto.models.country.Country;
import cibertec.proyecto.models.country.Location;
import cibertec.proyecto.services.CountryService;
import cibertec.proyecto.services.LocationService;
import cibertec.proyecto.services.StateService;

@Controller
public class LocationController {
	/**
	 * locationService
	 */
	@Autowired
	private LocationService locationService;
	
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
	 * getLocations
	 * 
	 * @param model
	 * @return
	 */
	@GetMapping("/locations")
	public String getLocations(Model model) {
		List<Location> locations = locationService.getLocations();
		model.addAttribute("locations", locations);
		List<cibertec.proyecto.models.country.State> states = stateService.getStates();
		model.addAttribute("states", states);
		List<Country> countries = countryService.getCountries();
		model.addAttribute("countries", countries);
		return "location";
	}

	/**
	 * addLocation
	 * 
	 * @param location
	 * @return
	 */
	@PostMapping("/addlocation")

	public String addLocation(Location location) {
		locationService.save(location);
		return "redirect:/locations";
	}
}
