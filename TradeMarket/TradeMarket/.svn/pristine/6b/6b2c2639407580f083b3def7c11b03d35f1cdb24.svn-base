package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="newsflash",catalog="trademarket")
public class NewsFlash {
	@Id
	@Column(name="company_id",unique=true,nullable=true)
	private Long companyId;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_discription")
	private String companyDiscription;
	
	public Long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyDiscription() {
		return companyDiscription;
	}
	public void setCompanyDiscription(String companyDiscription) {
		this.companyDiscription = companyDiscription;
	}
}
