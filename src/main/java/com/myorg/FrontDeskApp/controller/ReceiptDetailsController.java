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
import com.myorg.FrontDeskApp.dto.ReceiptDetails;
import com.myorg.FrontDeskApp.repository.DevoteeDetailsRepository;
import com.myorg.FrontDeskApp.service.DevoteeDetailsService;
import com.myorg.FrontDeskApp.service.ReceiptDetailsService;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
//@RequestMapping("/user")
@RestController
public class ReceiptDetailsController {
	@Autowired
	ReceiptDetailsService rdService;

	@RequestMapping(MyRequestMappings.GET_RECEIPT_BY_ID)
	public ReceiptDetails getReceiptById(@PathVariable Integer receiptId) {
		return rdService.getReceiptById(receiptId);
	}
	
	@RequestMapping(MyRequestMappings.GET_ALL_RECEIPT)
	public List<ReceiptDetails> getAllReceiptDetails() {
		return rdService.getAllReceiptDetails();
	}
	
	@RequestMapping(value= MyRequestMappings.SAVE_RECEIPT, method= RequestMethod.POST)
	public void saveReceipt(@RequestBody ReceiptDetails rdDto) {
		rdService.saveReceipt(rdDto);
	}
}
