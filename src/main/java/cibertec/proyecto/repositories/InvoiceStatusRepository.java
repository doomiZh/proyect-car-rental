package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.invoice.InvoiceStatus;

/**
 * 
 * @author Admin
 *
 */
@Repository
public interface InvoiceStatusRepository extends JpaRepository<InvoiceStatus ,Integer> {

}
