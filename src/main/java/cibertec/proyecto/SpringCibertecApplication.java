package cibertec.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cibertec.proyecto.init.CarFleetInitDB;

/**
 * @version 0.1
 * @author Grupo 4 @
 */
@SpringBootApplication()
public class SpringCibertecApplication implements CommandLineRunner {

	/**
	 * CarFleetInitDB
	 */
	@Autowired
	CarFleetInitDB carFleetInit;

	/**
	 * main : the main method
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringCibertecApplication.class, args);
	}

	/**
	 * run : insert data to database
	 * @param
	 */
	@Override
	public void run(String... args) throws Exception {
		carFleetInit.initCounties();
		carFleetInit.initStates();
		carFleetInit.initLocations();
		carFleetInit.initUsers();
		carFleetInit.initJobTitles();
		carFleetInit.initVehiculeStatus();
		carFleetInit.initVehiculeModel();
		carFleetInit.initVehiculeType();
		carFleetInit.initEmployeeTypes();
		carFleetInit.initEmployees();
		carFleetInit.initInvoiceStatus();
		carFleetInit.initSuppliers();
		carFleetInit.initVehiculeMaintenance();
	}

}
