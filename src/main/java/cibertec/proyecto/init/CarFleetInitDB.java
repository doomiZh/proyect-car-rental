package cibertec.proyecto.init;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.InvoiceStatus;
import cibertec.proyecto.models.Userss;
import cibertec.proyecto.models.VehicleModel;
import cibertec.proyecto.models.VehicleStatus;
import cibertec.proyecto.models.VehiculeType;
import cibertec.proyecto.models.person.EmployeeType;
import cibertec.proyecto.models.person.JobTitle;
import cibertec.proyecto.repositories.ClientRepository;
import cibertec.proyecto.repositories.EmployeeRepository;
import cibertec.proyecto.repositories.EmployeeTypeRepository;
import cibertec.proyecto.repositories.InvoiceRepository;
import cibertec.proyecto.repositories.InvoiceStatusRepository;
import cibertec.proyecto.repositories.JobTitleRepository;
import cibertec.proyecto.repositories.SupplierRepository;
import cibertec.proyecto.repositories.UserRepository;
import cibertec.proyecto.repositories.VehiculeHireRepository;
import cibertec.proyecto.repositories.VehiculeMaintenanceRepository;
import cibertec.proyecto.repositories.VehiculeModelRepository;
import cibertec.proyecto.repositories.VehiculeRepository;
import cibertec.proyecto.repositories.VehiculeStatusRepository;
import cibertec.proyecto.repositories.VehiculeTypeRepository;

/**
 * 
 * @author grupo 4
 * @version 0.1
 */
@Service
@Transactional
public class CarFleetInitDB implements ICarFleetInit {
	
	@Autowired
	UserRepository userRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	InvoiceStatusRepository   invoiceStatusRepository;
	@Autowired
	InvoiceRepository invoiceRepository;
	@Autowired
	JobTitleRepository jobTitleRepository;
	@Autowired
	EmployeeTypeRepository  employeeTypeRepository;
	@Autowired
	SupplierRepository supplierRepository;
	@Autowired
	VehiculeModelRepository vehiculeModelRepository;
	@Autowired
	VehiculeStatusRepository vehiculeStatusRepository;
	@Autowired
	VehiculeTypeRepository  vehiculeTypeRepository;
	@Autowired
	EmployeeRepository  employeeRepository;
	@Autowired
	VehiculeRepository vehiculeRepository;
	@Autowired
	VehiculeHireRepository vehiculeHireRepository;
	@Autowired
	VehiculeMaintenanceRepository  vehiculeMaintenanceRepository;
	
	/**
	 * initUsers
	 */
	@Override
	public void initUsers() {
	Userss user =new Userss(1, "admin", "admin");
	Userss user2 =new Userss(2, "user", "user");
	userRepository.save(user);
	userRepository.save(user2);
	}

	/**
	 * initEmployeeTypes
	 */
	@Override
	public void initEmployeeTypes() {
	   EmployeeType employeeType1=new EmployeeType(1,"Full-Time","Full-Time");
	   EmployeeType employeeType2=new EmployeeType(2,"Part-Time","Part-Time");
	   employeeTypeRepository.save(employeeType1);
	   employeeTypeRepository.save(employeeType2);
	}

	/**
	 * initJobTitles
	 */
	@Override
	public void initJobTitles() {
		JobTitle jobTitle=new JobTitle(1, "Manager", "Manager");
		JobTitle jobTitle2=new JobTitle(2, "Executive", "Executive");
		jobTitleRepository.save(jobTitle);
		jobTitleRepository.save(jobTitle2);
	}

	/**
	 * initInvoiceStatus
	 */
	@Override
	public void initInvoiceStatus() {
		InvoiceStatus invoiceStatus=new InvoiceStatus(1, "Valid", "none");
		InvoiceStatus invoiceStatus2=new InvoiceStatus(2, "Expired", "none");
		invoiceStatusRepository.save(invoiceStatus);
		invoiceStatusRepository.save(invoiceStatus2);
	}

	/**
	 * initVehiculeModel
	 */
	@Override
	public void initVehiculeModel() {
		vehiculeModelRepository.save(new VehicleModel(1, "Toyota Yaris 2020", "Toyota Yaris 2020"));
		vehiculeModelRepository.save(new VehicleModel(2, "Toyota Corolla 2022", "Toyota Corolla 2022"));
		vehiculeModelRepository.save(new VehicleModel(3, "Toyota 4Runner 2021", "Toyota 4Runner 2021"));
		vehiculeModelRepository.save(new VehicleModel(4, "Kia Rio 2018", "Kia Rio 2018"));
		vehiculeModelRepository.save(new VehicleModel(5, "Kia Cerato 2020", "Kia Cerato 2020"));
	}

	/**
	 * initVehiculeStatus
	 */
	@Override
	public void initVehiculeStatus() {
		vehiculeStatusRepository.save(new VehicleStatus(1,"Disponible","Disponible"));
		vehiculeStatusRepository.save(new VehicleStatus(2,"Averiado","Averiado"));
		vehiculeStatusRepository.save(new VehicleStatus(3,"En Mantenimiento","En Mantenimiento"));
	}

	/**
	 * initVehiculeType
	 */
	@Override
	public void initVehiculeType() {
		 vehiculeTypeRepository.save(new VehiculeType(1, "Auto Sedan", "Auto Sedan"));
		 vehiculeTypeRepository.save(new VehiculeType(2, "Auto Hatchback", "Auto Hatchback"));
		 vehiculeTypeRepository.save(new VehiculeType(3, "Camioneta Rural", "Camioneta Rural"));
		 vehiculeTypeRepository.save(new VehiculeType(4, "Camioneta Van", "Camioneta Van"));
		 vehiculeTypeRepository.save(new VehiculeType(5, "Camioneta Pickup", "Camioneta Pickup"));
	}
	
}
