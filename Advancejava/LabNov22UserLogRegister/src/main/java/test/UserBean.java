package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class UserBean implements Serializable {
private String uname;
private String pass;
private String fname;
private String lname;
private String add;

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}

}
