package com.console.users.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stockticker",catalog="trademarket")
public class StockTicker {
	@Id
	@Column(name ="stocktickerID",unique=true,nullable=false)
	private Long stocktickerID;
	@Column(name="indexname")
	private String indexName;
	@Column(name="pricevalue")
	private Double priceValue;
	@Column(name="chngedvalue")
	private Double chngedValue;
	@Column(name="changeper")
	private Double changePer;
	public Long getStocktickerID() {
		return stocktickerID;
	}
	public void setStocktickerID(Long stocktickerID) {
		this.stocktickerID = stocktickerID;
	}
	public String getIndexName() {
		return indexName;
	}
	public void setIndexName(String indexName) {
		this.indexName = indexName;
	}
	public Double getPriceValue() {
		return priceValue;
	}
	public void setPriceValue(Double priceValue) {
		this.priceValue = priceValue;
	}
	public Double getChngedValue() {
		return chngedValue;
	}
	public void setChngedValue(Double chngedValue) {
		this.chngedValue = chngedValue;
	}
	public Double getChangePer() {
		return changePer;
	}
	public void setChangePer(Double changePer) {
		this.changePer = changePer;
	}
}
