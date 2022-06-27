package delta.dev.software.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import cibertec.proyecto.models.vehicule.Vehicule;
import cibertec.proyecto.repositories.EmployeeRepository;
import cibertec.proyecto.repositories.LocationRepository;
import cibertec.proyecto.repositories.VehiculeModelRepository;
import cibertec.proyecto.repositories.VehiculeRepository;
import cibertec.proyecto.repositories.VehiculeStatusRepository;
import cibertec.proyecto.repositories.VehiculeTypeRepository;
import cibertec.proyecto.services.VehiculeService;



@SpringBootTest
class SpringCibertecApplicationTests {

	@Mock
	VehiculeRepository vehiculeRepository;

	@InjectMocks
	private VehiculeService vehiculeService;

	@Autowired
	VehiculeTypeRepository vehiculeTypeRepository;

	@Autowired
	VehiculeStatusRepository vehiculeStatusRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	VehiculeModelRepository vehiculeModelRepository;

	@Autowired
	LocationRepository locationRepository;
	
}
