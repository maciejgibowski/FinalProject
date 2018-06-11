package pl.coderslab.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pl.coderslab.entity.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

	List<Worker> findByFirstName(String firstName);

	List<Worker> findByLastName(String lastName);

	List<Worker> findByEmail(String email);


	@Query("SELECT c FROM Worker c WHERE email LIKE %:search% OR firstName LIKE %:search% OR lastName LIKE %:search% OR email LIKE %:search%")
	List<Worker> findByAnything1(@Param("search")String search);
	
	Worker findById(long workerid);
}
