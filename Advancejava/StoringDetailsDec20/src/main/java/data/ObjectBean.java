package data;

import java.io.Serializable;



@SuppressWarnings("serial")
public class ObjectBean implements Serializable{
	
	private String firstName;
	private String lastName;
	private long phn;
	private String mailId;
	

	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public long getPhn() {
		return phn;
	}


	public void setPhn(long phn) {
		this.phn = phn;
	}


	public String getMailId() {
		return mailId;
	}


	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	
	

}
