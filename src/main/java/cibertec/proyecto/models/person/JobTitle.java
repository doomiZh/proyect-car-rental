package cibertec.proyecto.models.person;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import cibertec.proyecto.models.CommonObject;

/**
 * 
 * @author Admin
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class JobTitle extends CommonObject {

	public JobTitle() {
		super();
	}

	public JobTitle(Integer id, String description, String details) {
		super(id, description, details);
	}

}
