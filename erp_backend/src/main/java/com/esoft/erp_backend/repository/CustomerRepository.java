package com.esoft.erp_backend.repository;
import com.esoft.erp_backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	List<Customer> findByAroma(String aroma);
}
