package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.VehiculoTipo;

/**
 * 
 * @author VehiculeTypeRepository
 *
 */
@Repository
public interface VehiculeTypeRepository extends JpaRepository<VehiculoTipo, Integer> {

}
