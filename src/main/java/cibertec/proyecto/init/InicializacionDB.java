package cibertec.proyecto.init;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.Usuario;
import cibertec.proyecto.models.VehiculoModelo;
import cibertec.proyecto.models.VehiculoEstado;
import cibertec.proyecto.models.VehiculoTipo;
import cibertec.proyecto.repositories.ClienteRepository;
import cibertec.proyecto.repositories.UsuarioRepository;
import cibertec.proyecto.repositories.AlquilerRepository;
import cibertec.proyecto.repositories.VehiculoModeloRepository;
import cibertec.proyecto.repositories.VehiculoRepository;
import cibertec.proyecto.repositories.VehiculoEstadoRepository;
import cibertec.proyecto.repositories.VehiculoTipoRepository;

/**
 * 
 * @author grupo 4
 * @version 0.1
 */
@Service
@Transactional
public class InicializacionDB implements IInicializacionInit {
	
	@Autowired
	UsuarioRepository userRepository;
	
	@Autowired
	ClienteRepository clientRepository;

	@Autowired
	VehiculoModeloRepository vehiculeModelRepository;
	
	@Autowired
	VehiculoEstadoRepository vehiculeStatusRepository;
	
	@Autowired
	VehiculoTipoRepository  vehiculeTypeRepository;

	@Autowired
	VehiculoRepository vehiculeRepository;
	
	@Autowired
	AlquilerRepository vehiculeHireRepository;
	
	/**
	 * initUsers
	 */
	@Override
	public void initUsers() {
		Usuario user =new Usuario(1, "admin", "admin");
		Usuario user2 =new Usuario(2, "user", "user");
		userRepository.save(user);
		userRepository.save(user2);
	}

	/**
	 * initVehiculeModel
	 */
	@Override
	public void initVehiculeModel() {
		vehiculeModelRepository.save(new VehiculoModelo(1, "Toyota Yaris 2020", "Toyota Yaris 2020"));
		vehiculeModelRepository.save(new VehiculoModelo(2, "Toyota Corolla 2022", "Toyota Corolla 2022"));
		vehiculeModelRepository.save(new VehiculoModelo(3, "Toyota 4Runner 2021", "Toyota 4Runner 2021"));
		vehiculeModelRepository.save(new VehiculoModelo(4, "Kia Rio 2018", "Kia Rio 2018"));
		vehiculeModelRepository.save(new VehiculoModelo(5, "Kia Cerato 2020", "Kia Cerato 2020"));
	}

	/**
	 * initVehiculeStatus
	 */
	@Override
	public void initVehiculeStatus() {
		vehiculeStatusRepository.save(new VehiculoEstado(1,"Disponible","Disponible"));
		vehiculeStatusRepository.save(new VehiculoEstado(2,"Averiado","Averiado"));
		vehiculeStatusRepository.save(new VehiculoEstado(3,"En Mantenimiento","En Mantenimiento"));
	}

	/**
	 * initVehiculeType
	 */
	@Override
	public void initVehiculeType() {
		 vehiculeTypeRepository.save(new VehiculoTipo(1, "Auto Sedan", "Auto Sedan"));
		 vehiculeTypeRepository.save(new VehiculoTipo(2, "Auto Hatchback", "Auto Hatchback"));
		 vehiculeTypeRepository.save(new VehiculoTipo(3, "Camioneta Rural", "Camioneta Rural"));
		 vehiculeTypeRepository.save(new VehiculoTipo(4, "Camioneta Van", "Camioneta Van"));
		 vehiculeTypeRepository.save(new VehiculoTipo(5, "Camioneta Pickup", "Camioneta Pickup"));
	}
	
}
