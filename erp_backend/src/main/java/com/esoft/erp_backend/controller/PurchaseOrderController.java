package com.esoft.erp_backend.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.esoft.erp_backend.entity.PurchaseOrder;
import com.esoft.erp_backend.service.PurchaseOrderService;

@RestController
@RequestMapping("/api/purchaseOrder")
@CrossOrigin(origins="http://localhost:5173")
public class PurchaseOrderController {

	@Autowired
	private PurchaseOrderService purchaseOrderService;
	
	
	@PostMapping
	public PurchaseOrder createPurchaseOrder(@RequestBody PurchaseOrder purchaseOrder) {
		return purchaseOrderService.savePurchaseOrder(purchaseOrder);
	}
	
	@GetMapping
	public List<PurchaseOrder> getAllPurchaseOrders(){
		return purchaseOrderService.getAllPurchaseOrders();
	}
	
	@GetMapping("/id/{id}")
	public PurchaseOrder getPurchaseOrderById(@PathVariable Long id) {
		return purchaseOrderService.getPurchaseOrderById(id);
	}
	
	@GetMapping("/po/{po_no}")
	public PurchaseOrder getPurchaseOrderByPoNo(@PathVariable String po_no) {
		return purchaseOrderService.getPurchaseOrderByPoNo(po_no);
	}
	
	@DeleteMapping("/id/{id}")
	public String deletePurchaseOrderById(@PathVariable Long id) {
		purchaseOrderService.deletePurchaseOrderById(id);
		return ("Purchase Order deleted successfully of id"+ id);
	}
	
	@DeleteMapping("/po/{po_no}")
	public String deletePurchaseOrderByPoNo(@PathVariable String po_no) {
		purchaseOrderService.deletePurchaseOrderByPoNo(po_no);
		return ("Purchase Order deleted Successfully of po number:" +po_no);
	}
	
	@PutMapping("/id/{id}")
	public PurchaseOrder updatePurchaseOrderById(@PathVariable Long id,@RequestBody PurchaseOrder purchaseOrder) {
		return purchaseOrderService.updatePurchaseOrderById(id,purchaseOrder);
	}
	
	@PutMapping("/po/{po_no}")
	public PurchaseOrder updatePurchaseOrderByPoNo(@PathVariable String po_no,@RequestBody PurchaseOrder purchaseOrder) {
		return purchaseOrderService.updatePurchaseOrderByPoNo(po_no,purchaseOrder);
	}
}
