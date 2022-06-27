package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.person.Employee;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  
}
