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

import cibertec.proyecto.models.VehiculeHire;
import cibertec.proyecto.services.VehiculeHireService;

@RestController
@RequestMapping("/api/vehiculehire")
public class VehiculeHireApiController {

	@Autowired
	private VehiculeHireService vehiculehireService;

	public List<VehiculeHire> getVehiculeTypeList() {
		return vehiculehireService.getVehiculeHires();
	}
	
	@GetMapping("{id}")
	public Optional<VehiculeHire> obtenerVehiculeHire(@PathVariable int id) {
		return vehiculehireService.findById(id);
	}
	
	@PostMapping
	public ResponseEntity<VehiculeHire> registrar(@RequestBody VehiculeHire hire) {
		VehiculeHire vehiculehireGuard = vehiculehireService.save(hire);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(vehiculehireGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<VehiculeHire> deleteById(@PathVariable int id) {
		vehiculehireService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
}
