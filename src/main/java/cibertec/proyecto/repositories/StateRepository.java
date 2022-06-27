package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.country.State;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

}