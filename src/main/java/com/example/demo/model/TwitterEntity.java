package com.example.demo.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;


@Entity
@Table
@Data
public class TwitterEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer twitterId;
	
	@Column
	private String twitterName;
	
	@Column
	private String twitterData;
	
	@Column
	private String comment;
	
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@CreationTimestamp
	private Date createdAt;

	public TwitterEntity() {
		
	}

	public Integer getTwitterId() {
		return twitterId;
	}

	public void setTwitterId(Integer twitterId) {
		this.twitterId = twitterId;
	}

	public String getTwitterName() {
		return twitterName;
	}

	public void setTwitterName(String twitterName) {
		this.twitterName = twitterName;
	}

	public String getTwitterData() {
		return twitterData;
	}

	public void setTwitterData(String twitterData) {
		this.twitterData = twitterData;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreateAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "TwitterEntity [twitterId=" + twitterId + ", twitterName=" + twitterName + ", twitterData=" + twitterData
				+ ", comment=" + comment + ", createAt=" + createdAt + "]";
	}


	
	
}
