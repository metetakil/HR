package com.mtakil.hr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mtakil.hr.model.ExamResult;
import com.mtakil.hr.service.KPSSQueryService;

@RestController
public class KPSSController {
	
	private static final Logger logger = LoggerFactory.getLogger(KPSSController.class);

	@Autowired
	private KPSSQueryService kPSSQueryService;
	
	@GetMapping("/hr/getKpss")
	public ExamResult[] getKpss(@RequestParam(value="tcno", required = true) String tcno) {
		logger.info("Received a kpss query request for controller for tcno " + tcno);
		return kPSSQueryService.getExamResultsForTcno(tcno);
	}
	
}