package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.country.Location;
import cibertec.proyecto.repositories.LocationRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class LocationService {

	/**
	 * locationRepository
	 */
	@Autowired
	private LocationRepository locationRepository;

	/**
	 * getLocations
	 * 
	 * @return
	 */
	public List<Location> getLocations() {
		return locationRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param location
	 */
	public void save(Location location) {
		locationRepository.save(location);

	}
}
