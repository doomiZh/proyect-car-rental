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

import cibertec.proyecto.models.Cliente;
import cibertec.proyecto.services.ClienteService;

@RestController
@RequestMapping("/api/clients")
public class ClienteApiController {
	@Autowired
	private ClienteService clientService;

	public List<Cliente> getClientsTypeList() {
		return clientService.getClients();
	}
	
	@GetMapping("{id}")
	public Optional<Cliente> obtenerClient(@PathVariable int id) {
		return clientService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Cliente> registrar(@RequestBody Cliente client) {
		Cliente clientGuard = clientService.save(client);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(clientGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Cliente> deleteById(@PathVariable int id) {
		clientService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
}
