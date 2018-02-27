package com.console.users.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sectors", catalog = "trademarket")
public class Sectors {

	@Id
	@Column(name = "sector_id", unique = true, nullable = false)
	private Long sectorId;
	@Column(name = "sector_name")
	private String sectorName;
	@Column(name = "sector_url")
	private String sectorUrl;
	@Column(name = "price_value")
	private Double priceValue;
	@Column(name = "change_value")
	private Double changeValue;
	
	
	public Sectors() {
	}


	public Long getSectorId() {
		return sectorId;
	}


	public void setSectorId(Long sectorId) {
		this.sectorId = sectorId;
	}


	public String getSectorName() {
		return sectorName;
	}


	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}


	public String getSectorUrl() {
		return sectorUrl;
	}


	public void setSectorUrl(String sectorUrl) {
		this.sectorUrl = sectorUrl;
	}


	public Double getPriceValue() {
		return priceValue;
	}


	public void setPriceValue(Double priceValue) {
		this.priceValue = priceValue;
	}


	public Double getChangeValue() {
		return changeValue;
	}


	public void setChangeValue(Double changeValue) {
		this.changeValue = changeValue;
	}

}
