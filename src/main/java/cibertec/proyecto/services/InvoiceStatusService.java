package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.InvoiceStatus;
import cibertec.proyecto.repositories.InvoiceStatusRepository;

/**
 * 
 * @author grupo 4
 *
 */
@Service
public class InvoiceStatusService {

	/**
	 * invoiceStatusRepository
	 */
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;

	/**
	 * getInvoices
	 * 
	 * @return
	 */
	public List<InvoiceStatus> getInvoices() {
		return invoiceStatusRepository.findAll();
	}

}
