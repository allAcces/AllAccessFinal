package com.all.access.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Buyer")
public class  Buyer  implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private int usersId;
	@Column
	String userFullName;
	@Column
	String usersName;
	@Column
	String usersPassword;
	@Column
	String usersEmailAddress;
	@Column
	String userContactNumber;
	@Column
	String userGender;
	
	
	public Buyer() {}


	public Buyer(int usersId, String userFullName, String usersName, String usersPassword, String usersEmailAddress,
			String userContactNumber, String userGender) {
		super();
		this.usersId = usersId;
		this.userFullName = userFullName;
		this.usersName = usersName;
		this.usersPassword = usersPassword;
		this.usersEmailAddress = usersEmailAddress;
		this.userContactNumber = userContactNumber;
		this.userGender = userGender;
	}


	public int getUsersId() {
		return usersId;
	}


	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}


	public String getUserFullName() {
		return userFullName;
	}


	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}


	public String getUsersName() {
		return usersName;
	}


	public void setUsersName(String usersName) {
		this.usersName = usersName;
	}


	public String getUsersPassword() {
		return usersPassword;
	}


	public void setUsersPassword(String usersPassword) {
		this.usersPassword = usersPassword;
	}


	public String getUsersEmailAddress() {
		return usersEmailAddress;
	}


	public void setUsersEmailAddress(String usersEmailAddress) {
		this.usersEmailAddress = usersEmailAddress;
	}


	public String getUserContactNumber() {
		return userContactNumber;
	}


	public void setUserContactNumber(String userContactNumber) {
		this.userContactNumber = userContactNumber;
	}


	public String getUserGender() {
		return userGender;
	}


	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
	

	
}
