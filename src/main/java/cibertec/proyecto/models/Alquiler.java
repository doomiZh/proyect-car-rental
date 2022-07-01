package cibertec.proyecto.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * 
 * @author grupo 4
 *
 */
@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Alquiler {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "vehicleid", insertable = false, updatable = false)
	private Vehicule vehicle;
	
	private Integer vehicleid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateOut;
	
	private Date timeOut;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateIn;
	
	private Date timeIn;

	@ManyToOne
	@JoinColumn(name = "clientid", insertable = false, updatable = false)
	private Cliente client;
	
	private Integer clientid;

	private Double price;

	private String remarks;

	public Alquiler(int id, Vehicule vehicle, Integer vehicleid, Date dateOut, Date timeOut, Date dateIn,
			Date timeIn, Cliente client, Integer clientid, Double price, String remarks) {
		super();
		this.id = id;
		this.vehicle = vehicle;
		this.vehicleid = vehicleid;
		this.dateOut = dateOut;
		this.timeOut = timeOut;
		this.dateIn = dateIn;
		this.timeIn = timeIn;
		this.client = client;
		this.clientid = clientid;
		this.price = price;
		this.remarks = remarks;
	}

	public Alquiler() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Vehicule getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicule vehicle) {
		this.vehicle = vehicle;
	}

	public Integer getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(Integer vehicleid) {
		this.vehicleid = vehicleid;
	}

	public Date getDateOut() {
		return dateOut;
	}

	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}

	public Date getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(Date timeOut) {
		this.timeOut = timeOut;
	}

	public Date getDateIn() {
		return dateIn;
	}

	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}

	public Date getTimeIn() {
		return timeIn;
	}

	public void setTimeIn(Date timeIn) {
		this.timeIn = timeIn;
	}

	public Cliente getClient() {
		return client;
	}

	public void setClient(Cliente client) {
		this.client = client;
	}

	public Integer getClientid() {
		return clientid;
	}

	public void setClientid(Integer clientid) {
		this.clientid = clientid;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
