package com.all.access.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table ( name ="Enquiry")
public class Enquiry implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	int enquiryID;
	@Column
	private String name;
	@Column
	private String emailAddress;
	@Column
	private String enquiryType;
	@Column
	String enquiryMsg;
	@Column(name="enquirymessagedate")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date enquiryMsgDate;
	
	public Enquiry() {}

	public Enquiry(int enquiryID, String name, String emailAddress, String enquiryType, String enquiryMsg,
			Date enquiryMsgDate) {
		super();
		this.enquiryID = enquiryID;
		this.name = name;
		this.emailAddress = emailAddress;
		this.enquiryType = enquiryType;
		this.enquiryMsg = enquiryMsg;
		this.enquiryMsgDate = enquiryMsgDate;
	}

	public int getEnquiryID() {
		return enquiryID;
	}

	public void setEnquiryID(int enquiryID) {
		this.enquiryID = enquiryID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getEnquiryType() {
		return enquiryType;
	}

	public void setEnquiryType(String enquiryType) {
		this.enquiryType = enquiryType;
	}

	public String getEnquiryMsg() {
		return enquiryMsg;
	}

	public void setEnquiryMsg(String enquiryMsg) {
		this.enquiryMsg = enquiryMsg;
	}

	public Date getEnquiryMsgDate() {
		return enquiryMsgDate;
	}

	public void setEnquiryMsgDate(Date enquiryMsgDate) {
		this.enquiryMsgDate = enquiryMsgDate;
	}
	
	
	
	
}
