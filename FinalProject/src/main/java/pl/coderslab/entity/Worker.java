package pl.coderslab.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Email;


@Entity
@Table(name = "workers")
public class Worker {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	
	private long id;
	
	@NotNull
//	@Min(value = 3)
//	@Max(value = 15)
	private String firstName;
	
	@NotNull
//	@Min(value = 3)
//	@Max(value = 25)
	private String lastName;
	
	//@Size(min = 9, max = 9)
	private String phoneNumber;
	
	@Email    //[_a-zA-Z0-9-]+(\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\.[a-zA-Z0-9-]+)*\.([a-zA-Z]{2,}){1}
	private String email;
	
	
	private double workHourCost;
	
//	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER )
//	private DevicesType devicesType;

//	@OneToMany(mappedBy = "worker", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//	private List<Paid> paidsList = new ArrayList<Paid>();
		
	@OneToMany (mappedBy = "worker", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private List<Order> orders = new ArrayList<Order>();
	
	
	public Worker() {
		super();
	}


	public Worker(long id, String firstName, String lastName, String phoneNumber,
				  String email, double workHourCost) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.workHourCost = workHourCost;
	
	}

	public Worker(String firstName, String lastName, String phoneNumber,
				  String email, double workHourCost) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.workHourCost = workHourCost;
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public double getWorkHourCost() {
		return workHourCost;
	}


	public void setWorkHourCost(double workHourCost) {
		this.workHourCost = workHourCost;
	}
	
}
