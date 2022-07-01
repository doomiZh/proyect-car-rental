package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.repositories.VehiculeModelRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculeModelService {

	/**
	 * vehiculeModelRepository
	 */
	@Autowired
	private VehiculeModelRepository vehiculeModelRepository;

	/**
	 * getVehiculeModels
	 * @return
	 */
	public List<VehiculoModelo> getVehiculeModels() {
		return vehiculeModelRepository.findAll();
	}

}
