package com.all.access.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
@Table(name = "Feedback")
public class Feedback 
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int feedbackId;
	@Column
	private String feedbackMsg;
	@Column(name="feedbackdate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date feedbackDate;
	@Column
	private int rate;
	@Column
	private String userEmail;
	
	public Feedback() {}

	public Feedback(int feedbackId, String feedbackMsg, Date feedbackDate, int rate, String userEmail) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackMsg = feedbackMsg;
		this.feedbackDate = feedbackDate;
		this.rate = rate;
		this.userEmail = userEmail;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getFeedbackMsg() {
		return feedbackMsg;
	}

	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}

	public Date getFeedbackDate() {
		return feedbackDate;
	}

	public void setFeedbackDate(Date feedbackDate) {
		this.feedbackDate = feedbackDate;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	

	
	
	
}
