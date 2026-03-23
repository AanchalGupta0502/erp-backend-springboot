package com.esoft.erp_backend.entity;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name="customer_dtl1")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDtl1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long consId;
	private String cons;
	private String cAddress1;
	private String cAddress2;
	private String cAddress3;
	private String cAddress4;
	private String cDistrict;
	private String cState;
	private String cPin;
	private String cStateCd;
	private String cPhone1;
	private String cPhone2;
	private String cPhone3;
	private String cFax;
	private String cPanNo;
	private String cLstno;
	private String cCstno;
	private String cOlicno;
	private String cGstinNo;
	
	@ManyToOne
	@JoinColumn(name="entry_no")
	private Customer customer;
}
