package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.vehicule.VehicleModel;
import cibertec.proyecto.repositories.VehiculeModelRepository;

/**
 * 
 * @author Admin
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
	public List<VehicleModel> getVehiculeModels() {
		return vehiculeModelRepository.findAll();
	}

}
