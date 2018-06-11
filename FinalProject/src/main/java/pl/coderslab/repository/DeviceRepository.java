package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Device;


public interface DeviceRepository extends JpaRepository<Device, Long>{

	
	List<Device> findByCustomer(Customer customer);

	Device findById(long id);

	//Device findByOrderId(long orderNumber);
	
	
	
}
