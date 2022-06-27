package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.vehicule.VehiculeType;
import cibertec.proyecto.repositories.VehiculeTypeRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeTypeService {

	/**
	 * vehiculeTypeRepository
	 */
	@Autowired
	private VehiculeTypeRepository vehiculeTypeRepository;

	/**
	 * getVehiculeTypes
	 * 
	 * @return
	 */
	public List<VehiculeType> getVehiculeTypes() {
		return vehiculeTypeRepository.findAll();
	}

}
