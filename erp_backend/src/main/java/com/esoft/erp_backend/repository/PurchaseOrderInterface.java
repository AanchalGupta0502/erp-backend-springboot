package com.esoft.erp_backend.repository;
import com.esoft.erp_backend.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;

public interface PurchaseOrderInterface extends JpaRepository<PurchaseOrder, Long> {

}
