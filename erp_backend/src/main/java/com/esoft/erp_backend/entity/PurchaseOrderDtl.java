package com.esoft.erp_backend.entity;
import lombok.*;
import java.util.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class PurchaseOrderDtl {
	  @Id
	  @GeneratedValue(strategy=GenerationType.IDENTITY)
	  private Long item_No;
	  @Column(unique=true)
	  private Long sr_no;       		
	  private String po_srno;     		
	  private String item_type;   		
	  private String mat_name;    		
	  private String sizes;       		
	  private String unit;        		
	  private String board;       		
	  private String pr_rating;   		
	  private String finish;      		
	  private String face_type;   		
	  private String facing;      		
	  private String schedule;    		
	  private String dim_std;     		
	  private String rate_tp;               
	  private Long qty;         		
	  private Long wt;                    
	  private Long rate;        		
	  private Long discount;     		
	  private Long disc_rate;             
	  private Long add_pf;		
	  private Long frgt_per;		
	  private Long od;          		
	  private String od_unit;     		
	  private Long id;          		
	  private String id_unit;     		
	  private Long go;          		
	  private String go_unit;     		
	  private Long g1;          		
	  private String g1_unit;     		
	  private Long h;           		
	  private String h_unit;      		
	  private Long l;           		
	  private String l_unit;      		
	  private Long thk;         	
	  private String thk_unit;    		
	  private String drw_no;		
	  private String it_code;		
	  private String red_code;		
	  private String treatment;   		
	  private String cool_media;  		
	  private Long temp_min;    		
	  private Long temp_max;    		
	  private Long temp1_min;    		
	  private Long temp1_max;    		
	  private Long soak_time;   		
	  private String inspection; 		
	  private Long ins_charge;		
	  private String remark;      		
	  private String clr_code;		
	  private String pack_inst;		
	  private String ust;         		
	  private String ust_type;    		
	  private Long ust_charge;  		
	  private String mpt;         		
	  private String mpt_type;    		
	  private Long mpt_charge;  		
	  private String dpt;         		
	  private String dpt_type;    		
	  private Long dpt_charge;  		
	  private String igc;         		
	  private String igc_type;    		
	  private Long igc_charge;  		
	  private String hardness;    		
	  private String hard_type;   		
	  private Long hard_charge; 		
	  private String ferrite;     		
	  private String ferr_type;   		
	  private Long ferr_charge; 		
	  private String impact;      		
	  private String imp_type;    		
	  private Long imp_charge;  		
	  private String bend;        		
	  private String bend_type;   		
	  private Long bend_charge; 		
	  private String tensile;     		
	  private String ten_type;    		
	  private Long ten_charge;  		
	  private String swpw;        		
	  private String swpw_type;   		
	  private Long swpw_charge; 		
	  private String o_test;       		
	  private String otest_type;   		
	  private Long otest_charge; 		
	  private String dsc;			
	  private LocalDate expdt;                
	  private String ihold;    
	  private String amnd;    		
	  private String need_tp;                 
	  private String item_stat;   
	  
	  @ManyToOne
	  @JoinColumn(name="entry_no")
	  @JsonIgnore
	  private PurchaseOrder purchaseOrder;
}
