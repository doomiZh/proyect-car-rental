package cibertec.proyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculeHire;
import cibertec.proyecto.repositories.VehiculeHireRepository;

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
	private VehiculeHireRepository vehiculeHireRepository;

	/**
	 * getVehiculeHires
	 * 
	 * @return
	 */
	public List<VehiculeHire> getVehiculeHires() {
		return vehiculeHireRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param hire
	 * @return 
	 */
	public VehiculeHire save(VehiculeHire hire) {
		return vehiculeHireRepository.save(hire);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<VehiculeHire> findById(int id) {
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
