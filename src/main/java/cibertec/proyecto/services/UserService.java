package cibertec.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.user.Userss;
import cibertec.proyecto.repositories.UserRepository;
/**
 * 
 * @author grupo 4
 *
 */
@Service
public class UserService {

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * save
	 * @param user
	 */
	public void save(Userss user)
	{
		userRepository.save(user);
	}
}
