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

import cibertec.proyecto.models.Vehiculo;
import cibertec.proyecto.repositories.VehiculoModeloRepository;
import cibertec.proyecto.repositories.VehiculeRepository;
import cibertec.proyecto.repositories.VehiculoEstadoRepository;
import cibertec.proyecto.repositories.VehiculoTipoRepository;
import cibertec.proyecto.services.VehiculeService;



@SpringBootTest
class SpringCibertecApplicationTests {

	@Mock
	VehiculeRepository vehiculeRepository;

	@InjectMocks
	private VehiculeService vehiculeService;

	@Autowired
	VehiculoTipoRepository vehiculeTypeRepository;

	@Autowired
	VehiculoEstadoRepository vehiculeStatusRepository;

	@Autowired
	VehiculoModeloRepository vehiculeModelRepository;
	
}
