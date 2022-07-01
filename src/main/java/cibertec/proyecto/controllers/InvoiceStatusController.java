package cibertec.proyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import cibertec.proyecto.models.InvoiceStatus;
import cibertec.proyecto.services.InvoiceStatusService;

/**
 * 
 * @author Grupo 4
 * @version 0.1
 * 
 */
@Controller
public class InvoiceStatusController {

	/**
	 * invoiceStatusService
	 */
	@Autowired
	InvoiceStatusService invoiceStatusService;
	
	/**
	 * getInvoiceStatus
	 * @param model
	 * @return
	 */
	@GetMapping("/invoicestatus")
	public String getInvoiceStatus(Model model)
	{
		List<InvoiceStatus> invoicestatus=invoiceStatusService.getInvoices();
		model.addAttribute("invoices", invoicestatus);
		return "invoices_status";
	}
}
