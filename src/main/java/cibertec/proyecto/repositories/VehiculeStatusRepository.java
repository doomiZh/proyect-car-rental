package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.vehicule.VehicleStatus;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeStatusRepository extends JpaRepository<VehicleStatus, Integer> {

}
