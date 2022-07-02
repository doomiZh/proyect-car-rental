package cibertec.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cibertec.proyecto.init.InicializacionDB;

@SpringBootApplication()
public class SpringCibertecApplication implements CommandLineRunner {

	@Autowired
	InicializacionDB carFleetInit;

	
	public static void main(String[] args) {
		SpringApplication.run(SpringCibertecApplication.class, args);
	}

	
	@Override
	public void run(String... args) throws Exception {
		carFleetInit.initUsers();
		carFleetInit.initVehiculeStatus();
		carFleetInit.initVehiculeModel();
		carFleetInit.initVehiculeType();
	}

}
