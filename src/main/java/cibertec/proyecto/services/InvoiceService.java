package cibertec.proyecto.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cibertec.proyecto.models.invoice.Invoice;
import cibertec.proyecto.repositories.InvoiceRepository;

/**
 * 
 * @author Admin
 *
 */
@Service
public class InvoiceService {

	/**
	 * invoiceRepository
	 */
	@Autowired
	private InvoiceRepository invoiceRepository;

	/**
	 * getInvoices
	 * 
	 * @return
	 */
	public List<Invoice> getInvoices() {
		return invoiceRepository.findAll();
	}

	/**
	 * save
	 * 
	 * @param invoice
	 */
	public void save(Invoice invoice) {
		invoiceRepository.save(invoice);
	}

	/**
	 * findById
	 * 
	 * @param id
	 * @return
	 */
	public Invoice findById(int id) {
		return invoiceRepository.findById(id).get();
	}

	/**
	 * delete
	 * 
	 * @param id
	 */
	public void delete(int id) {
		invoiceRepository.delete(invoiceRepository.findById(id).get());
	}
}
