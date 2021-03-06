package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.VehiculoEstado;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface VehiculoEstadoRepository extends JpaRepository<VehiculoEstado, Integer> {

}
