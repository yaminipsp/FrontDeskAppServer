package com.myorg.FrontDeskApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.example.demo.dto.UserDto;
//import com.example.demo.service.UserService;
import com.myorg.FrontDeskApp.utils.MyRequestMappings;
import com.myorg.FrontDeskApp.dto.DevoteeDetails;
import com.myorg.FrontDeskApp.repository.DevoteeDetailsRepository;
import com.myorg.FrontDeskApp.service.DevoteeDetailsService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
//@RequestMapping("/user")
@RestController
public class DevoteeDetailsController {
	@Autowired
	DevoteeDetailsService ddService;

	@RequestMapping(MyRequestMappings.GET_DEVOTEE_BY_ID)
	public DevoteeDetails getDevoteeById(@PathVariable Integer devoteeId) {
		return ddService.getDevoteeById(devoteeId);
	}
	
	@RequestMapping(MyRequestMappings.GET_ALL_DEVOTEE)
	public List<DevoteeDetails> getAllDevotees() {
		return ddService.getAllDevotees();
	}
	
	@RequestMapping(value= MyRequestMappings.SEARCH_DEVOTEE)
	public List<DevoteeDetails> searchDevotee(@PathVariable String searchStr) {
		return ddService.searchDevotee(searchStr);
	}
	
	
	/*
	@RequestMapping(value= Constants.SAVE_DEVOTEE)
	public void saveDevotee() {
		ddService.saveDevotee();
	}*/
}
