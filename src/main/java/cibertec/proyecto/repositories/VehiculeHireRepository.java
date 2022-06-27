package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.vehicule.VehiculeHire;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface VehiculeHireRepository extends JpaRepository<VehiculeHire, Integer> {

}
