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
public class VehiculoEstado extends ObjectoComun {

	public VehiculoEstado() {
		super();
	}

	public VehiculoEstado(Integer id, String description, String details) {
		super(id, description, details);
	}

}
