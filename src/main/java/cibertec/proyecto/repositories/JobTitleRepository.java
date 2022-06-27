package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.person.JobTitle;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {

}
