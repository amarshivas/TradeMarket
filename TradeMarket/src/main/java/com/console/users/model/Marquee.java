package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="marquee",catalog="trademarket")
public class Marquee {
	@Id
	@Column(name ="marquee_id",unique=true,nullable=false)
	private Integer marqueeId;
	@Column(name="marquee_name")
	private String marqueeName;
	public Integer getMarqueeId() {
		return marqueeId;
	}
	public void setMarqueeId(Integer marqueeId) {
		this.marqueeId = marqueeId;
	}
	public String getMarqueeName() {
		return marqueeName;
	}
	public void setMarqueeName(String marqueeName) {
		this.marqueeName = marqueeName;
	}
	
	
}
