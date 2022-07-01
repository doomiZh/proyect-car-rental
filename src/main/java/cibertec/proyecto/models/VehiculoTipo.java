package cibertec.proyecto.models;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 
 * @author grupo 4
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehiculoTipo extends CommonObject {

	public VehiculoTipo() {
		super();

	}

	public VehiculoTipo(Integer id, String description, String details) {
		super(id, description, details);

	}

}