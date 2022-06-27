package cibertec.proyecto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cibertec.proyecto.models.invoice.Invoice;

/**
 * 
 * @author grupo 4
 *
 */
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

}
