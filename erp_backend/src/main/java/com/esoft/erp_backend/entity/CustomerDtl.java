package com.esoft.erp_backend.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="customer_dtl")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDtl {
	
	@Id
	private Long sNo;     
	private String name;        		
	private String person;      	
	private String desig; 
	@ManyToOne
	@JoinColumn(name="entry_no")
	private Customer customer;
}
