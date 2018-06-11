//package pl.coderslab.entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "statusType")
//public class StatusType {
//
//	
//	@Id
//	@GeneratedValue(strategy= GenerationType.IDENTITY)
//	private long id;
//	private String statusType;
//	
//	
//	public StatusType() {
//		
//	}
//	
//	public StatusType(String statusType) {
//		super();
//		this.statusType = statusType;
//	}
//
//	public StatusType(long id, String statusType) {
//		super();
//		this.id = id;
//		this.statusType = statusType;
//	}
//
//	public long getId() {
//		return id;
//	}
//	public void setId(long id) {
//		this.id = id;
//	}
//	public String getStatusType() {
//		return statusType;
//	}
//	public void setStatusType(String statusType) {
//		this.statusType = statusType;
//	}
//	
//}

package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statusType")
public class StatusType {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private String statusType;
	
	//@OneToOne(fetch = FetchType.EAGER)
	//private Order order;
	

	public StatusType() {
		
	}
	
	public long getId() {
		return id;
	}

	public StatusType(long id) {
		super();
		this.id = id;
	}

	public StatusType(String statusType) {
		super();
		this.statusType = statusType;
	}

	public StatusType(long id, String statusType) {
		super();
		this.id = id;
		this.statusType = statusType;
	}

	public String getStatusType() {
		return statusType;
	}

	public void setStatusType(String statusType) {
		this.statusType = statusType;
	}
}	
