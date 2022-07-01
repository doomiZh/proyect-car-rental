package cibertec.proyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculeMaintenance;
import cibertec.proyecto.repositories.VehiculeMaintenanceRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculeMaintenanceService {

	/**
	 * vehiculeMaintenanceRepository
	 */
	@Autowired
	private VehiculeMaintenanceRepository vehiculeMaintenanceRepository;

	/**
	 * getVehiculeMaintenances
	 * 
	 * @return
	 */
	public List<VehiculeMaintenance> getVehiculeMaintenances() {
		return vehiculeMaintenanceRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param m
	 */
	public void save(VehiculeMaintenance m) {
		vehiculeMaintenanceRepository.save(m);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Optional<VehiculeMaintenance> findById(int id) {
		return vehiculeMaintenanceRepository.findById(id);
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {
		vehiculeMaintenanceRepository.delete(vehiculeMaintenanceRepository.findById(id).get());

	}
}
