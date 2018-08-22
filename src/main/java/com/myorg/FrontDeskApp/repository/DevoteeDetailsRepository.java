package com.myorg.FrontDeskApp.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.myorg.FrontDeskApp.dto.DevoteeDetails;

@Repository
public interface DevoteeDetailsRepository extends JpaRepository<DevoteeDetails, Integer>{
	
	
	@Async
    @Query("SELECT d FROM DevoteeDetails d where first_name like :searchStr  OR LAST_NAME LIKE :searchStr OR PHONE LIKE :searchStr OR EMAIL LIKE :searchStr OR CONCAT_WS('', FIRST_NAME, LAST_NAME) LIKE :searchStr")
	List<DevoteeDetails> findbyNamePhoneEmail(@Param("searchStr") String searchStr) ;
	
}
