package cibertec.proyecto.init;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.client.Supplier;
import cibertec.proyecto.models.country.Country;
import cibertec.proyecto.models.country.Location;
import cibertec.proyecto.models.country.State;
import cibertec.proyecto.models.invoice.InvoiceStatus;
import cibertec.proyecto.models.person.Employee;
import cibertec.proyecto.models.person.EmployeeType;
import cibertec.proyecto.models.person.JobTitle;
import cibertec.proyecto.models.user.Userss;
import cibertec.proyecto.models.vehicule.VehicleModel;
import cibertec.proyecto.models.vehicule.VehicleStatus;
import cibertec.proyecto.models.vehicule.VehiculeMaintenance;
import cibertec.proyecto.models.vehicule.VehiculeType;
import cibertec.proyecto.repositories.ClientRepository;
import cibertec.proyecto.repositories.CountryRepository;
import cibertec.proyecto.repositories.EmployeeRepository;
import cibertec.proyecto.repositories.EmployeeTypeRepository;
import cibertec.proyecto.repositories.InvoiceRepository;
import cibertec.proyecto.repositories.InvoiceStatusRepository;
import cibertec.proyecto.repositories.JobTitleRepository;
import cibertec.proyecto.repositories.LocationRepository;
import cibertec.proyecto.repositories.StateRepository;
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
	CountryRepository countryRepository;
	@Autowired
	StateRepository stateRepository;
	@Autowired
	LocationRepository locationRepository;
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
	 * initCounties
	 */
	@Override
	public void initCounties() {
		Country country=new Country(1,"2FECE","Paris","France","French","Europe");
		Country country2=new Country(2,"23DAE","New York","USA","American","America");
	
		countryRepository.save(country);
		countryRepository.save(country2);
	}

	/**
	 * initStates
	 */
	@Override
	public void initStates() {
		
			State state=new State(1,"Ile de France", "Paris", "0OAE", countryRepository.findById(1).get(),1, "none");
			State state2=new State(2,"New York", "New York", "03DAE", countryRepository.findById(2).get(),2, "none");
			stateRepository.save(state);
			stateRepository.save(state2);	
	}

	/**
	 * initLocations
	 */
	@Override
	public void initLocations() {
		Location locatio=new Location(1, "New York", "New York", countryRepository.findById(1).get(),1, stateRepository.findById(1).get(),1, "New York", "");
		locationRepository.save(locatio);
	}

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
	 * initEmployees
	 */
	@Override
	public void initEmployees() {
		Employee emp1=new Employee(1, "", "Bud Y. ", "Farmer", 
				"worker", "", "9G979H8G", "Male", "married",
				countryRepository.findById(2).get(), 2, stateRepository.findById(1).get(), 
				2, new Date(), "Oakland", "2885 Station Street\r\n Oakland, CA 94612", "133434", "31431341",
				"bud.farmer@gmail.com", "bud.jpg", employeeTypeRepository.findById(1).get(), 1, "",
				"", jobTitleRepository.findById(1).get(), 1, new Date());
		employeeRepository.save(emp1);
	}

	@Override
	public void initContacts() {
		
	}

	/**
	 * initSuppliers
	 */
	@Override
	public void initSuppliers() {
		Supplier supplier=new Supplier(1, "Donald M. Ellis", "651 Lilac Lane Darien, GA 31305", "California", "13434134", "4232352", "www.google.com", "dobald.ellis@gmail.com", countryRepository.findById(2).get(), 2, stateRepository.findById(2).get(), 2, "none");
		supplierRepository.save(supplier);
		
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
	 * initVehiculeMaintenance
	 */
	@Override
	public void initVehiculeMaintenance() {
		VehiculeMaintenance vehiculeMaintenance=new VehiculeMaintenance(1, vehiculeRepository.findById(1).get(), 1, new Date(), new Date(), 22.0, supplierRepository.findById(1).get(), 1, "none");
	    vehiculeMaintenanceRepository.save(vehiculeMaintenance);
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
