package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.client.Supplier;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
