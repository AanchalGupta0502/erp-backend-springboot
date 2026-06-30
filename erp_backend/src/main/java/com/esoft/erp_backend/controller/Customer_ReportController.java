package com.esoft.erp_backend.controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.esoft.erp_backend.service.Customer_ReportService;
import com.esoft.erp_backend.dto.CustomerReportDto;
import com.esoft.erp_backend.service.Customer_ReportService;

import java.io.ByteArrayOutputStream;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;



@RestController
@RequestMapping("/api/customerReport")
@CrossOrigin("http://localhost:5173")
public class Customer_ReportController {
	
	@Autowired
	Customer_ReportService customerReportService;
	
	@GetMapping("/{aroma}")
	public List<CustomerReportDto> getCustomerByAroma(@PathVariable String aroma) {
		return customerReportService.getCustomerByAroma(aroma);
	}
	
	@GetMapping("/export/pdf/{aroma}")
	public ResponseEntity<byte[]> exportPdf(@PathVariable String aroma){
		try {
			List<CustomerReportDto> customers=customerReportService.getCustomerByAroma(aroma);
			
			ByteArrayOutputStream out=new ByteArrayOutputStream();
			
			Document document=new Document(PageSize.A4.rotate());
			
			PdfWriter.getInstance(document, out);
			
			document.open();
			
			document.add(new Paragraph("Customer Report"));
			
			PdfPTable table=new PdfPTable(12);
			table.setWidthPercentage(100);
			
			table.addCell("Name");
			table.addCell("Address1");
			table.addCell("Address2");
			table.addCell("Address3");
			table.addCell("District");
			table.addCell("State");
			table.addCell("Pin");
			table.addCell("Phone1");
			table.addCell("Phone2");
			table.addCell("Phone3");
			table.addCell("Email");
			table.addCell("Web");
			
			for(CustomerReportDto customer: customers) {
				table.addCell(customer.getName());
				table.addCell(customer.getAddress1());
				table.addCell(customer.getAddress2());
				table.addCell(customer.getAddress3());
				table.addCell(customer.getDistrict());
				table.addCell(customer.getState());
				table.addCell(customer.getPin());
				table.addCell(customer.getPhone1());
				table.addCell(customer.getPhone2());
				table.addCell(customer.getPhone3());
				table.addCell(customer.getEmail());
				table.addCell(customer.getWeb());
			}
			
			document.add(table);
			
			document.close();
			
			return ResponseEntity.ok()
	                .header(HttpHeaders.CONTENT_DISPOSITION,
	                        "attachment; filename=customer_report.pdf")
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(out.toByteArray());
			
		}catch(Exception e) {
			return ResponseEntity.internalServerError().build();
		}
	}
}
