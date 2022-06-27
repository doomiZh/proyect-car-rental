package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.user.Userss;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface UserRepository extends JpaRepository<Userss, Integer> {
  Userss findByUsername(String username);
}
