package com.myorg.FrontDeskApp.utils;


public interface MyRequestMappings {
	static final String GET_DEVOTEE_BY_ID = "/getDevoteeById/{devoteeId}";
	static final String GET_ALL_DEVOTEE = "/getAllDevotees";
	static final String SAVE_DEVOTEE = "/saveDevotee";
	static final String SEARCH_DEVOTEE = "/searchDevotee/{searchStr}";
	
	static final String GET_RECEIPT_BY_ID = "/getReceiptById/{receiptId}";
	static final String GET_ALL_RECEIPT = "/getAllReceiptDetails";
	static final String SAVE_RECEIPT = "/saveReceipt";
}
