package com.mtakil.hr.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.mtakil.hr.model.ExamResult;

@Service
public class KPSSQueryService {

	private static final Logger logger = LoggerFactory.getLogger(KPSSQueryService.class);

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
		logger.info(String.format("Received %d exam results from KPSS service.", examResultREArray == null ? 0 : examResultREArray.length));
		
		return examResultREArray;
	}
}
