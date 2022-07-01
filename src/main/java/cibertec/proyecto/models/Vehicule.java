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
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String name;
	@ManyToOne
	@JoinColumn(name = "vehicletypeid", insertable = false, updatable = false)
	private VehiculeType vehicleType;
	private Integer vehicletypeid;

	@ManyToOne
	@JoinColumn(name = "vehiclemodelid", insertable = false, updatable = false)
	private VehicleModel vehicleModel;
	private Integer vehiclemodelid;
	
	private String vehicleNumber;
	
	@ManyToOne
	@JoinColumn(name = "vehiclestatusid", insertable = false, updatable = false)
	private VehicleStatus vehicleStatus;
	private Integer vehiclestatusid;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	
	private String description;

	public Vehicule(int id, String name, VehiculeType vehicleType, Integer vehicletypeid, VehicleModel vehicleModel,
			Integer vehiclemodelid, String vehicleNumber, VehicleStatus vehicleStatus, Integer vehiclestatusid,
			Date acquisitionDate, String description) {
		super();
		this.id = id;
		this.name = name;
		this.vehicleType = vehicleType;
		this.vehicletypeid = vehicletypeid;
		this.vehicleModel = vehicleModel;
		this.vehiclemodelid = vehiclemodelid;
		this.vehicleNumber = vehicleNumber;
		this.vehicleStatus = vehicleStatus;
		this.vehiclestatusid = vehiclestatusid;
		this.acquisitionDate = acquisitionDate;
		this.description = description;
	}

	public Vehicule() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VehiculeType getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(VehiculeType vehicleType) {
		this.vehicleType = vehicleType;
	}

	public Integer getVehicletypeid() {
		return vehicletypeid;
	}

	public void setVehicletypeid(Integer vehicletypeid) {
		this.vehicletypeid = vehicletypeid;
	}

	public VehicleModel getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(VehicleModel vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Integer getVehiclemodelid() {
		return vehiclemodelid;
	}

	public void setVehiclemodelid(Integer vehiclemodelid) {
		this.vehiclemodelid = vehiclemodelid;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public VehicleStatus getVehicleStatus() {
		return vehicleStatus;
	}

	public void setVehicleStatus(VehicleStatus vehicleStatus) {
		this.vehicleStatus = vehicleStatus;
	}

	public Integer getVehiclestatusid() {
		return vehiclestatusid;
	}

	public void setVehiclestatusid(Integer vehiclestatusid) {
		this.vehiclestatusid = vehiclestatusid;
	}

	public Date getAcquisitionDate() {
		return acquisitionDate;
	}

	public void setAcquisitionDate(Date acquisitionDate) {
		this.acquisitionDate = acquisitionDate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
