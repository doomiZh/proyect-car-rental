package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.country.Country;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
