package com.myorg.FrontDeskApp.service;

import java.util.List;
import java.util.Optional;

//import com.example.demo.dto.UserDto;
import com.myorg.FrontDeskApp.dto.ReceiptDetails;

public interface ReceiptDetailsService {
	

    ReceiptDetails getReceiptById(Integer receiptId);
    void saveReceipt(ReceiptDetails rd_Dto);
    List<ReceiptDetails> getAllReceiptDetails();


}
