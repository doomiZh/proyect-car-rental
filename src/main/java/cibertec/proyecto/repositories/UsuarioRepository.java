package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.Usuario;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
  Usuario findByUsername(String username);
}
