package cibertec.proyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.repositories.VehiculoModeloRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class VehiculoModeloService {

	@Autowired
	private VehiculoModeloRepository vehiculoModeloRepository;

	
	public List<VehiculoModelo> getVehiculeModels() {
		return vehiculoModeloRepository.findAll();
	}
	
	public Optional<VehiculoModelo> findById(int id) {
		return vehiculoModeloRepository.findById(id);
	}
	
	public VehiculoModelo save(VehiculoModelo vehiculoModelo)
	{
		return vehiculoModeloRepository.save(vehiculoModelo);
	}
	
	public VehiculoModelo update(int id, VehiculoModelo vehiculoModelo)
	{
		vehiculoModelo.setId(id);
		
		return vehiculoModeloRepository.save(vehiculoModelo);
	}

}
