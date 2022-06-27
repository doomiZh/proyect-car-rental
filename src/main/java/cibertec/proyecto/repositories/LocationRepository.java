package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.country.Location;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface LocationRepository extends JpaRepository<Location, Integer> {

}
