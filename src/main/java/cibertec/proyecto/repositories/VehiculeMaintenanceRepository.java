package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.vehicule.VehiculeMaintenance;
/**
 * 
 * @author Admin
 *
 */
@Repository
public interface VehiculeMaintenanceRepository extends JpaRepository<VehiculeMaintenance, Integer> {
  
}
