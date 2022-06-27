package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.person.JobTitle;
import cibertec.proyecto.repositories.JobTitleRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class JobTitlesService {

	/**
	 * 
	 */
	@Autowired
	private JobTitleRepository jobTitlesRepository;

	/**
	 * getJobTitless
	 * 
	 * @return
	 */
	public List<JobTitle> getJobTitless() {
		return jobTitlesRepository.findAll();
	}

}
