package com.esoft.erp_backend.repository;
import com.esoft.erp_backend.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepository extends JpaRepository<Customer,Long>{

}
