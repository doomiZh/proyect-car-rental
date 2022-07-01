package cibertec.proyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.Alquiler;
import cibertec.proyecto.repositories.AlquilerRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculeHireService {

	/**
	 * 
	 */
	@Autowired
	private AlquilerRepository vehiculeHireRepository;

	/**
	 * getVehiculeHires
	 * 
	 * @return
	 */
	public List<Alquiler> getVehiculeHires() {
		return vehiculeHireRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param hire
	 * @return 
	 */
	public Alquiler save(Alquiler hire) {
		return vehiculeHireRepository.save(hire);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Alquiler> findById(int id) {
		return vehiculeHireRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void deleteById(int id) {
		vehiculeHireRepository.deleteById(id);
	}
}
