package cibertec.proyecto.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import cibertec.proyecto.models.user.Userss;
import cibertec.proyecto.services.UserService;

/**
 * 
 * @author Grupo 4
 *
 */
@Controller
public class UserController {

	/**
	 * userService
	 */
	@Autowired
	UserService userService;

	/**
	 * profile
	 * @return
	 */
	@GetMapping("/profile")
	public String profile()
	{
		return "profile";
	}

	/**
	 * addUser
	 * @param user
	 * @param redir
	 * @return
	 */
	@PostMapping(value="/adduser")
	public RedirectView addUser(Userss user, RedirectAttributes redir) {
		userService.save(user);	
		RedirectView  redirectView= new RedirectView("/login",true);
	        
	    return redirectView;				
	}	
}