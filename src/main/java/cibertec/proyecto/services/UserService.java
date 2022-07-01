package cibertec.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.Usuario;
import cibertec.proyecto.repositories.UsuarioRepository;
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
	UsuarioRepository userRepository;
	
	/**
	 * save
	 * @param user
	 */
	public void save(Usuario user)
	{
		userRepository.save(user);
	}
}
