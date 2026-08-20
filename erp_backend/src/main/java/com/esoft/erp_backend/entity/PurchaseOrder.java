package com.esoft.erp_backend.entity;
import java.time.LocalDate;
import lombok.*;
import java.util.*;
import jakarta.persistence.*;
@Entity
@Table(name="po_hdr")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PurchaseOrder {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long entry_no;
	@Column(unique=true)
	private String po_no;
	private LocalDate po_dt;
	private LocalDate cfg_dt;
	private LocalDate cfgo_dt;
	private LocalDate ctpm_dt;
	private LocalDate cmch_dt;
	private LocalDate cinsp_dt;
	private LocalDate cmp_dt;
	private LocalDate incmp_dt;
	private LocalDate cdd;
	private LocalDate edd;
	private String party;       		
	private String oparty;       		
	private String per_purc;     		
	private String desg_purc;    		
	private String per_store;    		
	private String desg_store;   		
	private String per_expd;     		
	private String desg_expd;    		
	private String per_prj;     		
	private String desg_prj;    		
	private String per_fin;     		
	private String desg_fin;    		
	private String per_euser;    		
	private String desg_euser;   		
	private String person;      		
	private String desig;       		
	private Long wo_no;       		
	private LocalDate wo_dt;			
	private String amend;                 
	private LocalDate amend_dt;		
	private String quot_ref;		
	private String tax_type;    		
	private Long sale_tax;    		
	private String form_no;	
	private Long ex_duty;     		
	private String ex_type;               
	private Long cess;			
	private Long secess;		
	private Long p_f;         		
	private Long frgt_per;		
	private Long frgt_amt;	
	private Long discount;     		
	private Long dollar_rt;    		
	private Long tot_qty;               
	private Long tot_wt;                
	private Long lris_per;    		
	private Long lris_amt;    		
	private Long order_val;             
	private Long unit_val;              
	private Long ust_amt;		
	private Long mpt_amt;		
	private Long dpt_amt;		
	private Long igc_amt;		
	private Long bend_amt;		
	private Long imp_amt;		
	private Long ferr_amt;		
	private Long ten_amt;		  
	private Long hard_amt;		
	private Long swpw_amt;		
	private Long total_frgt;	
	private Long total_pf;              
	private Long lris_tot;              
	private Long ust_tot;               
	private Long dpt_tot;               
	private Long mpt_tot;               
	private Long ten_tot;               
	private Long imp_tot;               
	private Long bend_tot;              
	private Long hard_tot;              
	private Long fer_tot;               
	private Long igc_tot;               
	private Long swpw_tot;              
	private Long oth_tot;               
	private Long insp_tot;             
	private Long total_as;              
	private Long total_ed;              
	private Long total_cess;            
	private Long total_scess;           
	private Long total_st;              
	private Long final_amt;             
	private String oth_dsc;		
	private Long oth_amt;		
	private String insp;			
	private Long insp_amt;		
	private Long insp2;			
	private Long insp2_amt;		
	private String insp3;			
	private Long insp3_amt;		
	private Long cpr_no;                
	private Long revision;    
	private LocalDate rev_dt;		
	private String remark;      		
	private String remark1;      		
	private String dollar_tp;           
	private String techdet1;		
	private String techdet2;		
	private String techdet3;		
	private String techdet4;		
	private String techdet5;		
	private String techdet6;		
	private String techdet7;		
	private String techdet8;		
	private String techdet9;		
	private String techdet10;		
	private String techdet11;		
	private String techdet12;		
	private String techdet13;		
	private String techdet14;		
	private String techdet15;		
	private String techdet16;		
	private String techdet17;		
	private String techdet18;		
	private String techdet19;		
	private String techdet20;		
	private String techdet21;		
	private String techdet22;		
	private String techdet23;		
	private String techdet24;		
	private String techdet25;		
	private String techdet26;
	private String techdet27;		
	private String techdet28;		
	private String techdet29;		
	private String techdet30;		
	private String pay_term;		
	private String prior_tp;              
	private LocalDate dt_tm;          	
	private String cnator;                
	private String bg_req;		
	private String bg_no;			
	private LocalDate bg_dt;           	
	private LocalDate bgex_dt;           	
	private Long pay_days;		
	private String urgent;                
	private String stat;	
	private String hold;			
	private String cf_hold;             
	private String cm_hold;               
	private String po_type;		
	private String amnd;    		
	private String po_stat;		
	
	//cascadetype.all means when parent is saved, child will also be saved
	//orphanRemoval=true means when a child is deleted, ie it no longer a part of parent , its removed from db and not just (gets in associated with parent and is stored in db)
	@OneToMany(mappedBy="purchaseOrder", cascade=CascadeType.ALL,orphanRemoval=true)
	private List<PurchaseOrderDtl> purchaseOrderChild;
}
