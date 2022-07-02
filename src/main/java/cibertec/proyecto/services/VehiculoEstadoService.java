package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculoEstado;
import cibertec.proyecto.repositories.VehiculoEstadoRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculoEstadoService {

	/**
	 * vehiculeStatusRepository
	 */
	@Autowired
	private VehiculoEstadoRepository vehiculeStatusRepository;

	/**
	 * getVehicleStatus
	 * 
	 * @return
	 */
	public List<VehiculoEstado> getVehicleStatus() {
		return vehiculeStatusRepository.findAll();
	}

}
