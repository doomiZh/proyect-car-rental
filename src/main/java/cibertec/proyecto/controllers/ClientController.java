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
import cibertec.proyecto.models.country.Country;
import cibertec.proyecto.models.country.State;
import cibertec.proyecto.services.ClientService;
import cibertec.proyecto.services.CountryService;
import cibertec.proyecto.services.StateService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class ClientController {
	/**
	 * clientService
	 */
	@Autowired
	private ClientService clientService;

	/**
	 * countryService
	 */
	@Autowired
	private CountryService countryService;

	/**
	 * stateService
	 */
	@Autowired
	private StateService stateService;

	/**
	 * getClients
	 * @param model
	 * @return
	 */
	@GetMapping("/clients")
	public String getClients(Model model) {
		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);
		
		return "clients";
	}

	/**
	 * addClient
	 * @param client
	 * @return
	 */
	@PostMapping("/addclient")

	public String addClient(Client client) {
		clientService.save(client);
		
		return "redirect:/clients";
	}

	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/client/{id}")
	public String findById(@PathVariable("id") int id, Model model) {
		Client client = clientService.findById(id).get();
		model.addAttribute("client", client);
		
		return "editClient";
	}

	/**
	 * updateClient
	 * @param id
	 * @param client
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateclient/{id}")
	public String updateClient(@PathVariable("id") long id, @Validated Client client, BindingResult result,
			Model model) {

		clientService.save(client);
		
		return "redirect:/clients";
	}

	/**
	 * deleteClient
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteclient/{id}")
	@Transactional
	public String deleteClient(@PathVariable("id") int id) {
		clientService.delete(id);
		
		return "redirect:/clients";
	}
}
