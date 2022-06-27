package cibertec.proyecto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.user.UserPrincipal;
import cibertec.proyecto.models.user.Userss;
import cibertec.proyecto.repositories.UserRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class MyUserDetailService implements UserDetailsService {

	/**
	 * userRepository
	 */
	@Autowired
	UserRepository userRepository;
	
	/**
	 * loadUserByUsername
	 * @param username
	 * @return UserDetails
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Userss user=userRepository.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("user not found !");
		}
		return new UserPrincipal(user);
	}

}
