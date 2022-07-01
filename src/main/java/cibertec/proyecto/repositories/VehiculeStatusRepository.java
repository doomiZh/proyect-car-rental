package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.VehicleStatus;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
