package delta.dev.software.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import delta.dev.software.models.client.Client;
/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
