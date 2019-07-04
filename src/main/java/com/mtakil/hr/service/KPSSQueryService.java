package com.mtakil.hr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtakil.hr.model.ExamResult;

@Service
public class KPSSQueryService {

	//@Autowired
	//private RestTemplate restTemplate;
	
	public ExamResult getExamResultsForTcno(String tcno) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<ExamResult> examResultRE = restTemplate.getForEntity("http://3.9.117.186:7777/kpss/sinavSonucu?tcno=" + tcno, 
				ExamResult.class);
		return examResultRE.getBody();
	}
}
