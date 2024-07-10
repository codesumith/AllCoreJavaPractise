package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PlayerBean implements Serializable{

	public String id;
	public String name;
	public byte[] b;
	
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
	public byte[] getB() {
		return b;
	}
	public void setB(byte[] b) {
		this.b = b;
	}
	
	
	
}
