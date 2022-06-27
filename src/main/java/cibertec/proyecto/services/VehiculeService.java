package cibertec.proyecto.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.vehicule.Vehicule;
import cibertec.proyecto.repositories.VehiculeRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class VehiculeService {

	/**
	 * vehiculeRepository
	 */
	@Autowired
	private VehiculeRepository vehiculeRepository;

	/**
	 * getVehicules
	 * 
	 * @return
	 */
	public List<Vehicule> getVehicules() {
		List<Vehicule> vehicules = vehiculeRepository.findAll();
		Collections.reverse(vehicules);
		return vehicules;
	}

	/**
	 * getCount
	 * 
	 * @return
	 */
	public long getCount() {
		return vehiculeRepository.count();
	}

	/**
	 * save
	 * 
	 * @param vehicule
	 * @return
	 */
	public Vehicule save(Vehicule vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Vehicule> findById(int id) {
		return vehiculeRepository.findById(id);
	}

	/**
	 * deleteById
	 * 
	 * @param id
	 */
	public void deleteById(int id) {

		vehiculeRepository.delete(vehiculeRepository.getOne(id));

	}

}
