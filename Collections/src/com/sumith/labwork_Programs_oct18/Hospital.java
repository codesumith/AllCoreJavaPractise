package com.sumith.labwork_Programs_oct18;

import java.util.List;

public class Hospital {

	private int hospitalCode;
	private String hospitalName;
	private List<String> listOfTreatments;
	private String contactPerson;
	private String contactNumber;
	private String Location;
	
	
	public Hospital() {
		super();
		
	}


	

	public Hospital( String hospitalName, List<String> listOfTreatments, String contactPerson,
			String contactNumber, String location) {
		super();
		
		this.hospitalName = hospitalName;
		this.listOfTreatments = listOfTreatments;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		Location = location;
	}




	public int getHospitalCode() {
		return hospitalCode;
	}


	public void setHospitalCode(int hospitalCode) {
		this.hospitalCode = hospitalCode;
	}


	public String getHospitalName() {
		return hospitalName;
	}


	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}


	public List<String> getListOfTreatments() {
		return listOfTreatments;
	}


	public void setListOfTreatments(List<String> listOfTreatments) {
		this.listOfTreatments = listOfTreatments;
	}


	public String getContactPerson() {
		return contactPerson;
	}


	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getLocation() {
		return Location;
	}


	public void setLocation(String location) {
		Location = location;
	}

	
	

	@Override
	public String toString() {
		return "\nhospitalCode=" + hospitalCode + ",\n\nhospitalName=" + hospitalName + ",\n\nlistOfTreatments="
				+ listOfTreatments + ",\n\ncontactPerson=" + contactPerson + ",\n\ncontactNumber=" + contactNumber
				+ ",\n\nLocation=" + Location + "";
	}
	
	
	

}
