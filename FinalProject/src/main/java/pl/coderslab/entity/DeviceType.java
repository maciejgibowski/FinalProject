package pl.coderslab.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deviceType")
public class DeviceType {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	private String deviceType;
	


//	@OneToMany (mappedBy = "devicesType", cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
//	private List<Worker> workers = new ArrayList<Worker>();
//
//	
//	public DeviceType() {
//		super();
//	}
//
//	public DeviceType(long id) {
//		super();
//		this.id = id;
//	}
//	
//	public DeviceType(String deviceType) {
//		super();
//		this.deviceType = deviceType;
//	}
//
//	public DeviceType(long id, String deviceType) {
//		super();
//		this.id = id;
//		this.deviceType = deviceType;
//	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

//	public List<Worker> getWorkers() {
//		return workers;
//	}
//
//	public void setWorkers(List<Worker> workers) {
//		this.workers = workers;
//	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		
	}
	public DeviceType() {
		super();
	}
	public DeviceType(long id, String deviceType) {
		super();
		this.id = id;
		this.deviceType = deviceType;
	}
	public DeviceType(String deviceType) {
		super();
		this.deviceType = deviceType;
	}
	
}
	


