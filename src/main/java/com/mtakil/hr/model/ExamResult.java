package com.mtakil.hr.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExamResult {

	private Long id;
	private String sinavTuru;
	private Long sinavYili;
	private Long aldigiPuan;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSinavTuru() {
		return sinavTuru;
	}

	public void setSinavTuru(String sinavTuru) {
		this.sinavTuru = sinavTuru;
	}

	public Long getSinavYili() {
		return sinavYili;
	}

	public void setSinavYili(Long sinavYili) {
		this.sinavYili = sinavYili;
	}

	public Long getAldigiPuan() {
		return aldigiPuan;
	}

	public void setAldigiPuan(Long aldigiPuan) {
		this.aldigiPuan = aldigiPuan;
	}

	@Override
	public String toString() {
		return String.format("ExamResult id:%s, sinavTuru:%s, sinavYili:%s, aldigiPuan:%s", 
				id, sinavTuru, sinavYili, aldigiPuan);
	}
	
}
