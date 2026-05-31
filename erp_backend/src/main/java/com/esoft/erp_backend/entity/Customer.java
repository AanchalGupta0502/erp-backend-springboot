package com.esoft.erp_backend.entity;
import java.time.LocalDate;
import java.util.*;
import jakarta.persistence.*;
import lombok.*;
	@Entity
	@Table(name="customer")
	@Getter
	@Setter
	@NoArgsConstructor
	@AllArgsConstructor
	public class Customer{
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long entryNo;
	private String name;
	private String address1;
	private String address2;    
	private String address3;    		
	private String address4;    		
	private String district;    		
	private String state;       		
	private String pin;         		
	private String stateCd;		
	private String phone1;      		
	private String phone2;      		
	private String phone3;      		
	private String fax;         		
	private String email;       		
	private String web;         		
	private String rngDiv;               
	private String panNo;               	
	private String lstno;       		
	private String cstno;       		
	private String olicno;      		
	private String gstinNo;   		
	private String waddress1;    		
	private String waddress2;    		
	private String wdistrict;    		
	private String wstate;       		
	private String wpin;         	
	private String wstate_cd;		
	private String wphone1;      		
	private String wphone2;      		
	private String wphone3;      		
	private String wfax;         		
	private String wgstinNo; 		
	private String custTp;    		
	private String grUnder;    		
	private String aroma;                
	private LocalDate dtTm;
	private String persons;     		
	private String reason;      	
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<CustomerDtl> contactPersons;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL,orphanRemoval=true)
	private List<CustomerDtl1> consignees;
	
	
	}

