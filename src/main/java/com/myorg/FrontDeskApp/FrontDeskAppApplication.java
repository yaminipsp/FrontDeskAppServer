package com.myorg.FrontDeskApp;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myorg.FrontDeskApp.dto.DevoteeDetails;
import com.myorg.FrontDeskApp.dto.ReceiptDetails;
import com.myorg.FrontDeskApp.repository.DevoteeDetailsRepository;
import com.myorg.FrontDeskApp.repository.ReceiptDetailsRepository;

@SpringBootApplication
public class FrontDeskAppApplication {

	@Autowired
	DevoteeDetailsRepository ddRepository;
	
	@Autowired
	ReceiptDetailsRepository rdRepository;

	public static void main(String[] args) {
		SpringApplication.run(FrontDeskAppApplication.class, args);
	}
	
	@SuppressWarnings("deprecation")
	@PostConstruct
	public void setupDbWithData(){
		
		DevoteeDetails dd= new DevoteeDetails();
		
		//dd.setDevoteeId(0);
		//dd.setDevoteeId(4);
		dd.setFirstName("TEST");
		dd.setPhone("1234567890");
		dd.setEmail("abcdee@gmail.com");
		System.out.println(dd.getDevoteeId()+"-----------------------------------------------");
		dd.setDateCreated(new java.sql.Date(new java.util.Date().getTime()));
		dd.setDateModified(new java.sql.Date(new java.util.Date().getTime()));
		//new DevoteeDetails(devoteeId, firstName, dateCreated, dateModified)
		dd = ddRepository.save(dd);
		
		
		dd=ddRepository.getOne(5);
		
		ReceiptDetails rd = new ReceiptDetails();
		rd.setReceiptId(0);
		rd.setDd(dd);
		rd.setServiceDate(new java.sql.Date(new java.util.Date().getTime()));
		rd.setDonation(10);
		rd.setService("my service");
		rd.setIscash("Y");
		rd.setDd(dd);
		rd.setDateCreated(new java.sql.Date(new java.util.Date().getTime()));
		rd.setDateModified(new java.sql.Date(new java.util.Date().getTime()));
		
		rdRepository.save(rd);
		
	}
	
}
