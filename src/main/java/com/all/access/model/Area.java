package com.all.access.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Area")
public class Area  implements Serializable{

	@Id
	private int areaID ;
	@Column
	private String areaName;
	
	
	
	
	public Area(int areaID, String areaName) {
		super();
		this.areaID = areaID;
		this.areaName = areaName;
		
	}



	public int getAreaID() {
		return areaID;
	}



	public void setAreaID(int areaID) {
		this.areaID = areaID;
	}



	public String getAreaName() {
		return areaName;
	}



	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

}