package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.country.State;
import cibertec.proyecto.repositories.StateRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class StateService {

	/**
	 * stateRepository
	 */
	@Autowired
	private StateRepository stateRepository;

	/**
	 * getStates
	 * 
	 * @return
	 */
	public List<State> getStates() {
		return stateRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param state
	 */
	public void save(State state) {
		stateRepository.save(state);
	}
}
