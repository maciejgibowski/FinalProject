package pl.coderslab.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.entity.StatusType;

public interface StatusTypeRepository extends JpaRepository<StatusType, Long>{

	//void delete(String statusType);
	
	
	
	List<StatusType> findAll();


}
