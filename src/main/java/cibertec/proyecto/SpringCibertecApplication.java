package cibertec.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cibertec.proyecto.init.CarFleetInitDB;

@SpringBootApplication()
public class SpringCibertecApplication implements CommandLineRunner {

	@Autowired
	CarFleetInitDB carFleetInit;

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCibertecApplication.class, args);
	}

	
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
		carFleetInit.initInvoiceStatus();
	}

}
