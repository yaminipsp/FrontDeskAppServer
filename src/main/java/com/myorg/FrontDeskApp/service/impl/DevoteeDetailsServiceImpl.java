package com.myorg.FrontDeskApp.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.FrontDeskApp.dto.DevoteeDetails;
import com.myorg.FrontDeskApp.repository.DevoteeDetailsRepository;
import com.myorg.FrontDeskApp.service.DevoteeDetailsService;

@Service
public class DevoteeDetailsServiceImpl implements DevoteeDetailsService {

	@Autowired
	DevoteeDetailsRepository ddRepository;

	@Override
	public DevoteeDetails getDevoteeById(Integer devoteeId) {
		return ddRepository.getOne(devoteeId);
	}
	
	

	@Override
	public void saveDevotee(DevoteeDetails ddDto) {
		//ddDto.setFirstName("firstname");
		//ddDto.setLastName("Yamini");
		//ddDto.setEmail("email@email.com");
		ddRepository.save(ddDto);
	}
	
	@Override
	public List<DevoteeDetails> searchDevotee(String searchStr) {
		return ddRepository.findbyNamePhoneEmail(searchStr);
	}
	
	
	

	/*
	@Override
	public void saveDevotee() {
		DevoteeDetails ddDto = new DevoteeDetails();
		System.out.println("I have created devoteedetails object");
		ddDto.setFirstName("firstname");
		ddDto.setLastName("Yamini");
		ddDto.setEmail("email@email.com");
		ddRepository.save(ddDto);
	}
	*/

	@Override
	public List<DevoteeDetails> getAllDevotees() {
		//return ddRepository.findAll().stream().collect(Collectors.toList());
		return ddRepository.findAll();
	}


/*
	@Override
	public DevoteeDetails getDevoteeBySearchStr(String searchStr) {
		// TODO Auto-generated method stub
		return ddRepository.findbyNamePhoneEmail(searchStr);
	}*/
}