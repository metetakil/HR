package com.mtakil.hr.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtakil.hr.model.ExamResult;

@Service
public class KPSSQueryService {

	//@Autowired
	//private RestTemplate restTemplate;
	
	@Value("${kpss.endpoint}")
	private String kpssEndPoint;
	
	@Value("${kpss.port}")
	private String kpssPort;
	
	public ExamResult[] getExamResultsForTcno(String tcno) {
		RestTemplate restTemplate = new RestTemplate();
		
		Map<String, String> uriParams = new HashMap<String, String>();
		uriParams.put("tcno", tcno);
		//ResponseEntity<ExamResult> examResultRE = restTemplate.getForEntity("http://3.9.117.186:7777/kpss/sinavSonucu?tcno=" + tcno, ExamResult.class);
		ExamResult[] examResultREArray = restTemplate.getForObject("http://" + kpssEndPoint + ":" + kpssPort + "/kpss/sinavSonucu?tcno={tcno}", ExamResult[].class, uriParams);
		
		for (ExamResult er : examResultREArray)
			System.out.println("ExamResult: " + er);
		return examResultREArray;
	}
}
