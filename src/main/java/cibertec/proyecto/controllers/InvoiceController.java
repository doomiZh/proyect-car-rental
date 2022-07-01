package cibertec.proyecto.controllers;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cibertec.proyecto.models.Client;
import cibertec.proyecto.models.Invoice;
import cibertec.proyecto.models.InvoiceStatus;
import cibertec.proyecto.services.ClientService;
import cibertec.proyecto.services.InvoiceService;
import cibertec.proyecto.services.InvoiceStatusService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 */
@Controller
public class InvoiceController {

	/**
	 * invoiceService
	 */
	@Autowired
	InvoiceService invoiceService;
	
	/**
	 * invoiceStatusService
	 */
	@Autowired
	InvoiceStatusService invoiceStatusService;
	
	/**
	 * clientService
	 */
	@Autowired
	ClientService clientService;

	/**
	 * getInvoices
	 * @param model
	 * @return
	 */
	@GetMapping("/invoices")
	public String getInvoices(Model model) {
		List<Invoice> invoices = invoiceService.getInvoices();
		model.addAttribute("invoices", invoices);

		List<InvoiceStatus> invoicesStatus = invoiceStatusService.getInvoices();
		model.addAttribute("invoicesStatus", invoicesStatus);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);

		return "invoices";
	}

	/**
	 * addInvoice
	 * @param invoice
	 * @return
	 */
	@PostMapping("/addinvoice")
	public String addInvoice(Invoice invoice) {
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	/**
	 * findById
	 * @param id
	 * @param model
	 * @return
	 */
	@RequestMapping("/invoice/{id}")
	public String findById(@PathVariable("id") int id, Model model)
	{
		List<InvoiceStatus> invoicesStatus = invoiceStatusService.getInvoices();
		model.addAttribute("invoicesStatus", invoicesStatus);

		List<Client> clients = clientService.getClients();
		model.addAttribute("clients", clients);
		
	 Invoice invoice=invoiceService.findById(id);
	 model.addAttribute("invoice", invoice);
	 return "editInvoice";
	}
	
	/**
	 * updateInvoice
	 * @param id
	 * @param invoice
	 * @param result
	 * @param model
	 * @return
	 */
	@PostMapping("/updateinvoice/{id}")
	public String updateInvoice(@PathVariable("id") long id,@Validated Invoice invoice, 
			  BindingResult result, Model model)
	{
		
		invoiceService.save(invoice);
		return "redirect:/invoices";
	}
	
	/**
	 * deleteInvoice
	 * @param id
	 * @return
	 */
	@GetMapping("/deleteinvoice/{id}")
	@Transactional
	public String deleteInvoice(@PathVariable("id") int id)
	{
		invoiceService.delete(id);
		return  "redirect:/invoices";
	}
}
