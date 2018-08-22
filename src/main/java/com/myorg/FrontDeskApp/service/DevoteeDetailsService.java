package com.myorg.FrontDeskApp.service;

import java.util.List;
import java.util.Optional;

import com.myorg.FrontDeskApp.dto.DevoteeDetails;


public interface DevoteeDetailsService {

	public DevoteeDetails getDevoteeById(Integer devoteeId);
	public void saveDevotee(DevoteeDetails ddDto);
	//public void saveDevotee();
	public List<DevoteeDetails> getAllDevotees();
	List<DevoteeDetails> searchDevotee(String searchStr);
	
	//public DevoteeDetails getDevoteeBySearchStr(String searchStr);
}
