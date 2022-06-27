package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.person.EmployeeType;
import cibertec.proyecto.repositories.EmployeeTypeRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class EmployeeTypesService {
	/**
	 * employeeTypesRepository
	 */
	@Autowired
	private EmployeeTypeRepository employeeTypesRepository;

	/**
	 * getEmployeeTypess
	 * 
	 * @return
	 */
	public List<EmployeeType> getEmployeeTypess() {
		return employeeTypesRepository.findAll();
	}

}
