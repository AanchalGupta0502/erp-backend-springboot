package com.esoft.erp_backend.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.esoft.erp_backend.entity.PurchaseOrder;
import com.esoft.erp_backend.entity.PurchaseOrderDtl;
import com.esoft.erp_backend.repository.PurchaseOrderRepository;
@Service
public class PurchaseOrderService {

	@Autowired
	public PurchaseOrderRepository purchaseorderrepository;
	
	public PurchaseOrder savePurchaseOrder(PurchaseOrder purchaseorder) {
		if(purchaseorder.getPurchaseOrderChild()!=null) {
			for(PurchaseOrderDtl dtl:purchaseorder.getPurchaseOrderChild()) {
				dtl.setPurchaseOrder(purchaseorder);
			}
		}
		return purchaseorderrepository.save(purchaseorder);
	}
	
	public PurchaseOrder getPurchaseOrderById(Long id) {
		Optional <PurchaseOrder> po=purchaseorderrepository.findById(id);
		return po.orElse(null);
	}
	
	public PurchaseOrder getPurchaseOrderByPoNo(String po) {
		Optional<PurchaseOrder> pur_order=purchaseorderrepository.findByPoNo(po);
		return pur_order.orElse(null);
	}
	
	public List<PurchaseOrder> getAllPurchaseOrders(){
		return purchaseorderrepository.findAll();
	}
	
	public void deletePurchaseOrderById(Long id) {
		purchaseorderrepository.deleteById(id);
	}
	
	public void deletePurchaseOrderByPoNo(String po_no) {
		purchaseorderrepository.deleteByPoNo(po_no);
	}
	public PurchaseOrder updatePurchaseOrderById(Long id,PurchaseOrder purchaseOrder) {
		purchaseOrder.setEntry_no(id);
		
		if(purchaseOrder.getPurchaseOrderChild()!=null) {
			for(PurchaseOrderDtl dtl:purchaseOrder.getPurchaseOrderChild()) {
				dtl.setPurchaseOrder(purchaseOrder);
			}
		}
		return purchaseorderrepository.save(purchaseOrder);
	}
	public PurchaseOrder updatePurchaseOrderByPoNo(String po,PurchaseOrder purchaseOrder) {
		purchaseOrder.setPo_no(po);
		
		if(purchaseOrder.getPurchaseOrderChild()!=null) {
			for(PurchaseOrderDtl dtl:purchaseOrder.getPurchaseOrderChild()) {
				dtl.setPurchaseOrder(purchaseOrder);
			}
		}
		return purchaseorderrepository.save(purchaseOrder);
	}
}
