package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculoTipo;
import cibertec.proyecto.repositories.VehiculoTipoRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculoTipoService {

	/**
	 * vehiculeTypeRepository
	 */
	@Autowired
	private VehiculoTipoRepository vehiculeTypeRepository;

	/**
	 * getVehiculeTypes
	 * 
	 * @return
	 */
	public List<VehiculoTipo> getVehiculeTypes() {
		return vehiculeTypeRepository.findAll();
	}
	
	

}
