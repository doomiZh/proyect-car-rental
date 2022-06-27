package cibertec.proyecto.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cibertec.proyecto.models.vehicule.Vehicule;
import cibertec.proyecto.services.VehiculeService;

@RestController
@RequestMapping("/api/vehicule")
public class VehiculeApiController {

	@Autowired
	private VehiculeService vehiculeService;

	public List<Vehicule> getVehiculeTypeList() {
		return vehiculeService.getVehicules();
	}
	
	@GetMapping("{id}")
	public Optional<Vehicule> obtenerVehicule(@PathVariable int id) {
		return vehiculeService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<Vehicule> registrar(@RequestBody Vehicule vehicule) {
		Vehicule vehiculeGuard = vehiculeService.save(vehicule);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(vehiculeGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<Vehicule> deleteById(@PathVariable int id) {
		vehiculeService.deleteById(id);
		return ResponseEntity.noContent().build();
	}


}
