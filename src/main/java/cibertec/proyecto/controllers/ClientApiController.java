package cibertec.proyecto.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cibertec.proyecto.models.client.Client;
import cibertec.proyecto.services.ClientService;

@RestController
@RequestMapping("/api/clients")
public class ClientApiController {
	@Autowired
	private ClientService clientService;

	public List<Client> getClientsTypeList() {
		return clientService.getClients();
	}
	
	@GetMapping("{id}")
	public Optional<Client> obtenerClient(@PathVariable int id) {
		return clientService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Client> registrar(@RequestBody Client client) {
		Client clientGuard = clientService.save(client);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(clientGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Client> deleteById(@PathVariable int id) {
		clientService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
