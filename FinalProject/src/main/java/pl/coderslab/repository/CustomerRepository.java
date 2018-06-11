package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Worker;


public interface CustomerRepository extends JpaRepository<Customer, Long> { 

	List<Customer> findByLastName(String lastName);
	List<Customer> findByFirstName(String firstName);
	List<Customer> findByPhoneNumber(String phoneNumber);
	List<Customer> findByEmail(String email);
	//Customer findById (long id);
	
	@Query("SELECT c FROM Customer c WHERE email LIKE %:search% OR firstName LIKE %:search% OR lastName LIKE %:search%")
	List<Customer> findByAnything(@Param("search")String search);
	
	Customer findById (long customerid);

}
