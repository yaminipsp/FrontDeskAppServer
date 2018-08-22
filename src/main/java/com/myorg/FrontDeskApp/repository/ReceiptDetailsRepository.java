package com.myorg.FrontDeskApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myorg.FrontDeskApp.dto.ReceiptDetails;

@Repository
public interface ReceiptDetailsRepository extends JpaRepository<ReceiptDetails, Integer>{
}
