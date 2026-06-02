package com.esoft.erp_backend.entity;
import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="customer_dtl")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDtl {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long sNo;     
	private String name;        		
	private String person;      	
	private String desig; 
	@ManyToOne
	@JoinColumn(name="entry_no")
	@JsonIgnore
	private Customer customer;
}
