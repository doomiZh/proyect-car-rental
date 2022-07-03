package cibertec.proyecto.controllers;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.services.VehiculoModeloService;

@RestController
@RequestMapping("/api/vehiculo-modelos")
public class VehiculoModeloApiController {

	@Autowired
	private VehiculoModeloService vehiculoModeloService;

	
	@GetMapping
	public List<VehiculoModelo> getVehicleModelList()
	{
		return vehiculoModeloService.getVehiculeModels();
	}
	
	@GetMapping("{id}")
	public Optional<VehiculoModelo> obtenerClient(@PathVariable int id) {
		return vehiculoModeloService.findById(id);
	}
	
	@PostMapping
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<VehiculoModelo> crear(VehiculoModelo vehiculoModelo) {
		VehiculoModelo vehiculoModeloGuard = vehiculoModeloService.save(vehiculoModelo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(vehiculoModeloGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	@PostMapping("{id}")
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public ResponseEntity<VehiculoModelo> editar(@PathVariable int id, VehiculoModelo vehiculoModelo) {
		VehiculoModelo vehiculoModeloGuard = vehiculoModeloService.update(id, vehiculoModelo);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(vehiculoModeloGuard.getId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
}
