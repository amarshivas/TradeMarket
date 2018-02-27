package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="volume_toppers",catalog ="trademarket")
public class VolumeToppers {
@Id
@Column(name ="Volume_Toppers_id",unique=true,nullable=false)
private Long volume_Toppers_id;
@Column(name="comapany_name")
private String comapany_Name;
@Column(name="high")
private Double high;
@Column(name="low")
private Double low;
@Column(name="close")
private String close;
@Column(name="LTP")
private Double lTP;
@Column(name="volume_percent")
private Double volume_Percent;
@Column(name="volume")
private String volume;

	
	public VolumeToppers(){
		
	}


	public Long getVolume_Toppers_id() {
		return volume_Toppers_id;
	}


	public void setVolume_Toppers_id(Long volume_Toppers_id) {
		this.volume_Toppers_id = volume_Toppers_id;
	}


	public String getComapany_Name() {
		return comapany_Name;
	}


	public void setComapany_Name(String comapany_Name) {
		this.comapany_Name = comapany_Name;
	}


	public Double getHigh() {
		return high;
	}


	public void setHigh(Double high) {
		this.high = high;
	}


	public Double getLow() {
		return low;
	}


	public void setLow(Double low) {
		this.low = low;
	}


	public String getClose() {
		return close;
	}


	public void setClose(String close) {
		this.close = close;
	}


	public Double getlTP() {
		return lTP;
	}


	public void setlTP(Double lTP) {
		this.lTP = lTP;
	}


	public Double getVolume_Percent() {
		return volume_Percent;
	}


	public void setVolume_Percent(Double volume_Percent) {
		this.volume_Percent = volume_Percent;
	}


	public String getVolume() {
		return volume;
	}


	public void setVolume(String volume) {
		this.volume = volume;
	}
	
		
	}
