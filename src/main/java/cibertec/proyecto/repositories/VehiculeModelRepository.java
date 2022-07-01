package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.VehicleModel;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface VehiculeModelRepository extends JpaRepository<VehicleModel, Integer> {

}
