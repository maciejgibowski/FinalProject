package pl.coderslab.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private Date dateOfAcceptance;
	private Date plannedDateOfRepair;
	private Date dateOfRepair;
	private int assignedEmployee;
	private String problemDescription;
	private String repairDescription;
	
	//@OneToOne (/*mappedBy = "order", */cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
	private String statusType;
	

	private double repairCost;
	private double markup;
	private double componentsCost;
	private double amountOfWorkHours;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER )
	private Device device;
	
	@ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.EAGER )
	private Worker worker;
	
	public Order(Date dateOfAcceptance, Date plannedDateOfRepair, Date dateOfRepair, int assignedEmployee,
			String problemDescription, String repairDescription, String statusType, double repairCost, double markup,
			double componentsCost, double amountOfWorkHours, Device device) {
		super();
		this.dateOfAcceptance = dateOfAcceptance;
		this.plannedDateOfRepair = plannedDateOfRepair;
		this.dateOfRepair = dateOfRepair;
		this.assignedEmployee = assignedEmployee;
		this.problemDescription = problemDescription;
		this.repairDescription = repairDescription;
		this.statusType = statusType;
		this.repairCost = repairCost;
		this.markup = markup;
		this.componentsCost = componentsCost;
		this.amountOfWorkHours = amountOfWorkHours;
		this.device = device;
	}

	public Order(long id, Date dateOfAcceptance, Date plannedDateOfRepair, Date dateOfRepair, int assignedEmployee,
			String problemDescription, String repairDescription, String statusType, double repairCost, double markup,
			double componentsCost, double amountOfWorkHours, Device device) {
		super();
		this.id = id;
		this.dateOfAcceptance = dateOfAcceptance;
		this.plannedDateOfRepair = plannedDateOfRepair;
		this.dateOfRepair = dateOfRepair;
		this.assignedEmployee = assignedEmployee;
		this.problemDescription = problemDescription;
		this.repairDescription = repairDescription;
		this.statusType = statusType;
		this.repairCost = repairCost;
		this.markup = markup;
		this.componentsCost = componentsCost;
		this.amountOfWorkHours = amountOfWorkHours;
		this.device = device;
	}

	public Order() {
		
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public Date getDateOfAcceptance() {
		return dateOfAcceptance;
	}


	public void setDateOfAcceptance(Date dateOfAcceptance) {
		this.dateOfAcceptance = dateOfAcceptance;
	}


	public Date getPlannedDateOfRepair() {
		return plannedDateOfRepair;
	}


	public void setPlannedDateOfRepair(Date plannedDateOfRepair) {
		this.plannedDateOfRepair = plannedDateOfRepair;
	}


	public Date getDateOfRepair() {
		return dateOfRepair;
	}


	public void setDateOfRepair(Date dateOfRepair) {
		this.dateOfRepair = dateOfRepair;
	}


	public int getAssignedEmployee() {
		return assignedEmployee;
	}


	public void setAssignedEmployee(int assignedEmployee) {
		this.assignedEmployee = assignedEmployee;
	}


	public String getProblemDescription() {
		return problemDescription;
	}


	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}


	public String getRepairDescription() {
		return repairDescription;
	}


	public void setRepairDescription(String repairDescription) {
		this.repairDescription = repairDescription;
	}


	public String getStatusType() {
		return statusType;
	}


	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}


	public double getRepairCost() {
		return repairCost;
	}


	public void setRepairCost(double repairCost) {
		this.repairCost = repairCost;
	}


	public double getMarkup() {
		return markup;
	}


	public void setMarkup(double markup) {
		this.markup = markup;
	}


	public double getComponentsCost() {
		return componentsCost;
	}


	public void setComponentsCost(double componentsCost) {
		this.componentsCost = componentsCost;
	}


	public double getAmountOfWorkHours() {
		return amountOfWorkHours;
	}


	public void setAmountOfWorkHours(double amountOfWorkHours) {
		this.amountOfWorkHours = amountOfWorkHours;
	}


	public Device getDevice() {
		return device;
	}


	public void setDevice(Device device) {
		this.device = device;
	}
	
}
