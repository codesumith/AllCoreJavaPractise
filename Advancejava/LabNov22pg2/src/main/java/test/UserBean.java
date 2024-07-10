package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable{

	private String userName;
	private String Password;
	private String Address;
	private String MailId;
	private long phnNO;
	private String state;
	private String Country;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getMailId() {
		return MailId;
	}
	public void setMailId(String mailId) {
		MailId = mailId;
	}
	public long getPhnNO() {
		return phnNO;
	}
	public void setPhnNO(long phnNO) {
		this.phnNO = phnNO;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	
	
	
}
