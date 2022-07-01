package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.VehiculoModelo;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface VehiculoModeloRepository extends JpaRepository<VehiculoModelo, Integer> {

}
