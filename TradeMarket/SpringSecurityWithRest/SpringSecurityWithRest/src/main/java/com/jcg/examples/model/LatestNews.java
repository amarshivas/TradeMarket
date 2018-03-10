package com.jcg.examples.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "latest_news", catalog = "trademarket")
public class LatestNews {

	@Id
	@Column(name = "latest_news_id", unique = true, nullable = false)
	private Long latestNewsId;
	@Column(name = "latest_news_name")
	private String latestNewsName;
	@Column(name = "latest_news_url")
	private String latestNewsUrl;
	@Column(name = "created_date")
	private Timestamp created_date;
	
	
	public LatestNews() {
	}

	public Long getLatestNewsId() {
		return latestNewsId;
	}


	public void setLatestNewsId(Long latestNewsId) {
		this.latestNewsId = latestNewsId;
	}


	public String getLatestNewsName() {
		return latestNewsName;
	}

	public void setLatestNewsName(String latestNewsName) {
		this.latestNewsName = latestNewsName;
	}

	public String getLatestNewsUrl() {
		return latestNewsUrl;
	}

	public void setLatestNewsUrl(String latestNewsUrl) {
		this.latestNewsUrl = latestNewsUrl;
	}


	public Timestamp getCreated_date() {
		return created_date;
	}


	public void setCreated_date(Timestamp created_date) {
		this.created_date = created_date;
	}


}