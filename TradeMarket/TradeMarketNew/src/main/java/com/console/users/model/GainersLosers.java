package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gainers_losers", catalog = "trademarket")
public class GainersLosers {

	@Id
	@Column(name = "gainers_losers_id", unique = true, nullable = false)
	private Long gainerId;
	@Column(name = "company_name")
	private String companyName;
	@Column(name = "price")
	private String price;
	@Column(name = "percentage")
	private Double percentage;
	@Column(name = "company_url")
	private Double companyURL;
	
	public Long getGainerId() {
		return gainerId;
	}
	public void setGainerId(Long gainerId) {
		this.gainerId = gainerId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	public Double getPercentage() {
		return percentage;
	}
	public void setPercentage(Double percentage) {
		this.percentage = percentage;
	}
	public Double getCompanyURL() {
		return companyURL;
	}
	public void setCompanyURL(Double companyURL) {
		this.companyURL = companyURL;
	}
	
	
	


}