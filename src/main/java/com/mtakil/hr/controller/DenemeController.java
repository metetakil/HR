package com.mtakil.hr.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtakil.hr.service.KPSSQueryService;



@RestController
public class DenemeController {

	private static final Logger logger = LoggerFactory.getLogger(DenemeController.class);
	
	@Autowired
	private KPSSQueryService kPSSQueryService;
	
	@GetMapping("/hr")
	public void deneme(@RequestParam(value="tcno", required = true) String tcno) {
		logger.info("Received deneme request for " + tcno);
		System.out.println("Result: " + kPSSQueryService.getExamResultsForTcno(tcno));
	}
	
}
