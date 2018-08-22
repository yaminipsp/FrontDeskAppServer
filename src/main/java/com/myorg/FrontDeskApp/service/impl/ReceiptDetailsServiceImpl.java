package com.myorg.FrontDeskApp.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myorg.FrontDeskApp.dto.ReceiptDetails;
import com.myorg.FrontDeskApp.repository.DevoteeDetailsRepository;
import com.myorg.FrontDeskApp.repository.ReceiptDetailsRepository;
import com.myorg.FrontDeskApp.service.ReceiptDetailsService;

@Service
public class ReceiptDetailsServiceImpl implements ReceiptDetailsService {

	@Autowired
	ReceiptDetailsRepository rdRepository;
	
	@Override
	public ReceiptDetails getReceiptById(Integer receiptId) {
		// TODO Auto-generated method stub
		//rdRepository.
		ReceiptDetails rd = rdRepository.getOne(receiptId);
		System.out.println(rd.getService()+" "+rd.getServiceDate()+" "+rd.getDd().getFirstName());
		//rd.setDevDet(ddRepository.getOne(rd.getDevoteeId()));
		return rd;
		
	}

	@Override
	public void saveReceipt(ReceiptDetails rdDto) {
		// TODO Auto-generated method stub
		rdRepository.save(rdDto);

	}

	@Override
	public List<ReceiptDetails> getAllReceiptDetails() {
		// TODO Auto-generated method stub
		return rdRepository.findAll();
	}

}
