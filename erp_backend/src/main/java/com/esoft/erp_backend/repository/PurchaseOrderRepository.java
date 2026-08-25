package com.esoft.erp_backend.repository;
import com.esoft.erp_backend.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {
		Optional<PurchaseOrder> findByPoNo(String po);
		void deleteByPoNo(String po);
}
