package com.sumith.employee_management;

import java.io.*;

@SuppressWarnings("serial")
public class EmpBean implements Serializable{
	
	private String id;
	private String name;
	private String desg;
	private float bsal;
	private float tsal;
	
	//constructor
	public EmpBean() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	public float getBsal() {
		return bsal;
	}

	public void setBsal(float bsal) {
		this.bsal = bsal;
	}

	public float getTsal() {
		return tsal;
	}

	public void setTsalDB(float tsal) {
	this.tsal=tsal;
	}
	
	public void setTsal(float tsal) {
		this.tsal =tsal+((tsal*91)/100)+((tsal*63)/100);
	}
	
	//methods
	

}
