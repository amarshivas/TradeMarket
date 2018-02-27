package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sponsoredlinks",catalog="trademarket")
public class SponsoredLinks {
	@Id
	@Column(name="sponsored_id",unique=true,nullable=true)
	private Long sponsored_Id;
	@Column(name="sponsored_name")
	private String sponsored_Name;
	@Column(name="sponsored_discription")
	private String sponsored_Discription;
	
	public SponsoredLinks(){
		
	}

	public Long getSponsored_Id() {
		return sponsored_Id;
	}

	public void setSponsored_Id(Long sponsored_Id) {
		this.sponsored_Id = sponsored_Id;
	}

	public String getSponsored_Name() {
		return sponsored_Name;
	}

	public void setSponsored_Name(String sponsored_Name) {
		this.sponsored_Name = sponsored_Name;
	}

	public String getSponsored_Discription() {
		return sponsored_Discription;
	}

	public void setSponsored_Discription(String sponsored_Discription) {
		this.sponsored_Discription = sponsored_Discription;
	}
	
	
	
}
