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

import cibertec.proyecto.models.Cliente;
import cibertec.proyecto.services.ClienteService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class ClienteController {
	/**
	 * clientService
	 */
	@Autowired
	private ClienteService clientService;
	
	/**
	 * getClients
	 * @param model
	 * @return
	 */
	@GetMapping("/clients")
	public String getClients(Model model) {
		List<Cliente> clients = clientService.getClients();
		model.addAttribute("clients", clients);
		
		return "clients";
	}

	/**
	 * addClient
	 * @param client
	 * @return
	 */
	@PostMapping("/addclient")

	public String addClient(Cliente client) {
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
		Cliente client = clientService.findById(id).get();
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
	public String updateClient(@PathVariable("id") long id, @Validated Cliente client, BindingResult result,
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
		clientService.deleteById(id);
		return "redirect:/clients";
	}
}
