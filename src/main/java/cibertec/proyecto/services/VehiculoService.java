package cibertec.proyecto.services;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.Vehiculo;
import cibertec.proyecto.repositories.VehiculoRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculoService {

	/**
	 * vehiculeRepository
	 */
	@Autowired
	private VehiculoRepository vehiculeRepository;

	/**
	 * getVehicules
	 * 
	 * @return
	 */
	public List<Vehiculo> getVehicules() {
		List<Vehiculo> vehicules = vehiculeRepository.findAll();
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
	public Vehiculo save(Vehiculo vehicule) {
		return vehiculeRepository.save(vehicule);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<Vehiculo> findById(int id) {
		return vehiculeRepository.findById(id);
	}

	/**
	 * deleteById
	 * 
	 * @param id
	 */
	public void deleteById(int id) {

		vehiculeRepository.deleteById(id);

	}

	

}
