package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.InvoiceStatus;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus ,Integer> {

}
