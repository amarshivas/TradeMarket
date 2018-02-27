package com.console.users.model;

import java.sql.Timestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "news", catalog = "trademarket")
public class MostRead {
	private static final Logger logger = LoggerFactory.getLogger(MostRead.class);

	@Id
	@Column(name = "news_id", unique = true, nullable = false)
	private Long newsId;
	@Column(name = "news_name")
	private String newsName;
	@Column(name = "news_displayname")
	private String newsDisplayName;
	@Column(name = "news_url")
	private Long newsUrl;
	@Column(name = "news_hitcount")
	private Long newsHitCount;
	@Column(name = "news_createddate")
	private Timestamp news_Createddate;
	
	@Transient
	private String newsTime ="";
	
	
	public MostRead() {
	}



	public Long getNewsId() {
		return newsId;
	}



	public void setNewsId(Long newsId) {
		this.newsId = newsId;
	}



	public String getNewsName() {
		return newsName;
	}



	public void setNewsName(String newsName) {
		this.newsName = newsName;
	}



	public String getNewsDisplayName() {
		return newsDisplayName;
	}



	public void setNewsDisplayName(String newsDisplayName) {
		this.newsDisplayName = newsDisplayName;
	}



	public Long getNewsUrl() {
		return newsUrl;
	}



	public void setNewsUrl(Long newsUrl) {
		this.newsUrl = newsUrl;
	}



	public Long getNewsHitCount() {
		return newsHitCount;
	}



	public void setNewsHitCount(Long newsHitCount) {
		this.newsHitCount = newsHitCount;
	}



	public Timestamp getNews_Createddate() {
		return news_Createddate;
	}



	public void setNews_Createddate(Timestamp news_Createddate) {
		this.news_Createddate = news_Createddate;
	}



	public String getNewsTime() {
		return newsTime;
	}



	public void setNewsTime(String newsTime) {
		Timestamp newsCreatedDate = this.getNews_Createddate();
		Integer hours = newsCreatedDate.getHours();
		Integer minutes =newsCreatedDate.getMinutes();
		
		this.newsTime = hours.toString() +":"+minutes.toString();
		logger.info("newsTime -----------"+this.newsTime);
		logger.info("hours.toString() -----------"+hours.toString());
		logger.info("hours.toString() -----------"+newsCreatedDate.getMinutes());
		
	}



	
}

