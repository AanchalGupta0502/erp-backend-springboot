package com.esoft.erp_backend.service;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Service;
import com.esoft.erp_backend.repository.CustomerRepository;
import com.esoft.erp_backend.dto.CustomerReportDto;
import com.esoft.erp_backend.entity.Customer;

@Service
public class Customer_ReportService {
	
	@Autowired
	CustomerRepository customerRepository;
	CustomerReportDto customerReportDto;
	
	public List<CustomerReportDto> getCustomerByAroma(String aroma){
		List<Customer> customers=customerRepository.findByAroma(aroma);
		List<CustomerReportDto> reportList=new ArrayList<>();
		
		for(Customer cust:customers) {
			CustomerReportDto dto=new CustomerReportDto();
			dto.setName(cust.getName());
			dto.setAddress1(cust.getAddress1());
			dto.setAddress2(cust.getAddress2());
			dto.setAddress3(cust.getAddress3());
			dto.setDistrict(cust.getDistrict());
			dto.setState(cust.getState());
			dto.setPin(cust.getPin());
			dto.setPhone1(cust.getPhone1());
			dto.setPhone2(cust.getPhone2());
			dto.setPhone3(cust.getPhone3());
			dto.setEmail(cust.getEmail());
			dto.setWeb(cust.getWeb());
			reportList.add(dto);
		}
		return reportList;
	}
	
}
