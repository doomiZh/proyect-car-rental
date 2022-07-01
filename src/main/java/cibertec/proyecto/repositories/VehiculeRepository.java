package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.Vehiculo;

/**
 * 
 * @author VehiculeRepository
 *
 */
@Repository
public interface VehiculeRepository extends JpaRepository<Vehiculo, Integer> {

}
