package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cibertec.proyecto.models.VehiculoTipo;
import cibertec.proyecto.services.VehiculoTipoService;

@RestController
public class VehiculoTipoApiController {

	@Autowired
	private VehiculoTipoService vehiculeTypeService;

	@GetMapping("/api/vehicle-types")
	public List<VehiculoTipo> getVehiculeTypeList() {
		return vehiculeTypeService.getVehiculeTypes();
	}
	
}
