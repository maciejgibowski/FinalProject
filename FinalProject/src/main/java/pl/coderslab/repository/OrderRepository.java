package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.coderslab.entity.Device;
import pl.coderslab.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
	Order findById (long id);

	List<Order> findByDevice(Device device);
	List<Order> findRepairDescriptionByDeviceId(Device device);

	//List<Order> findByDeviceId(Device device);

}
