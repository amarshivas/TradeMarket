package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name="viewsrecommendations",catalog="trademarket")
public class ViewsRecomendation {
@Id
@Column(name="company_id",unique=true,nullable=false)
private Long companyId;
@Column(name="company_name")
private String companyName;
@Column(name="shortdiscription")
private String shortDiscription;
@Column(name="largediscription")
private String largeDiscription;
@Column(name="date")
private Timestamp createdDate;
@Column(name="discriptionurl")
private String discriptionUrl;

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
public String getShortDiscription() {
	return shortDiscription;
}
public void setShortDiscription(String shortDiscription) {
	this.shortDiscription = shortDiscription;
}
public String getLargeDiscription() {
	return largeDiscription;
}
public void setLargeDiscription(String largeDiscription) {
	this.largeDiscription = largeDiscription;
}
public Timestamp getCreatedDate() {
	return createdDate;
}
public void setCreatedDate(Timestamp createdDate) {
	this.createdDate = createdDate;
}
public String getDiscriptionUrl() {
	return discriptionUrl;
}
public void setDiscriptionUrl(String discriptionUrl) {
	this.discriptionUrl = discriptionUrl;
}


}
