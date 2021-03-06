package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.Alquiler;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface AlquilerRepository extends JpaRepository<Alquiler, Integer> {

}
