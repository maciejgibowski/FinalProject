package pl.coderslab.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Entity
@Table(name = "devices")
public class Device {
	

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@NotNull
//	@Min(value = 3)
//	@Max(value = 15)
	private String brand;
	
	@NotNull
//	@Min(value = 3)
//	@Max(value = 25)
	private String model;
	
	//@Pattern   - dopisać wyrażenie regularne
	private String serialNumber;
	private String deviceType;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER )
	private Customer customer;
	
	@OneToMany (mappedBy = "device", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Order> ordersList = new ArrayList<Order>();
	
	
	public Device( ) {
		
	}
	
	
	public Device(String brand, String model, String serialNumber, String deviceType, Customer customer) {
		super();
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.deviceType = deviceType;
		this.customer = customer;
	}


	public Device(long id, String brand, String model, String serialNumber, String deviceType, Customer customer) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.deviceType = deviceType;
		this.customer = customer;
		
	}
	


	public Device(String brand, String model, String serialNumber, String deviceType) {
		super();
		this.brand = brand;
		this.model = model;
		this.serialNumber = serialNumber;
		this.deviceType = deviceType;
	}


	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getDeviceType() {
		return deviceType;
	}


	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	
}
