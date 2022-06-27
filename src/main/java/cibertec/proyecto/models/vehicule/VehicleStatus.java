package cibertec.proyecto.models.vehicule;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import cibertec.proyecto.models.CommonObject;

/**
 * 
 * @author grupo 4
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleStatus extends CommonObject {

	public VehicleStatus() {
		super();
	}

	public VehicleStatus(Integer id, String description, String details) {
		super(id, description, details);
	}

}
