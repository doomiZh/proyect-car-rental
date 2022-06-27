package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.person.EmployeeType;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface EmployeeTypeRepository extends JpaRepository<EmployeeType, Integer> {

}