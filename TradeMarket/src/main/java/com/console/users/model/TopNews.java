package com.console.users.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topnews", catalog = "trademarket")
public class TopNews {

	@Id
	@Column(name = "topnews_id", unique = true, nullable = false)
	private Long topNewsId;
	@Column(name = "topnews_name")
	private String topNewsName;
	@Column(name = "topnews_url")
	private String topNewsUrl;
	@Column(name = "news_id")
	private Long newsId;
	
	@Column(name = "created_date")
	private Timestamp createdDate;
	
	public TopNews() {
	}



	public Long getTopNewsId() {
		return topNewsId;
	}



	public void setTopNewsId(Long topNewsId) {
		this.topNewsId = topNewsId;
	}



	public String getTopNewsName() {
		return topNewsName;
	}



	public void setTopNewsName(String topNewsName) {
		this.topNewsName = topNewsName;
	}



	public String getTopNewsUrl() {
		return topNewsUrl;
	}



	public void setTopNewsUrl(String topNewsUrl) {
		this.topNewsUrl = topNewsUrl;
	}



	public Long getNewsId() {
		return newsId;
	}



	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}



	public Timestamp getCreatedDate() {
		return createdDate;
	}



	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	


}