package test;

import java.io.Serializable;

@SuppressWarnings("serial")
public class BABean implements Serializable{

	private int an;
	private String hn;
	private Float bal;
	public int getAn() {
		return an;
	}
	public void setAn(int an) {
		this.an = an;
	}
	public String getHn() {
		return hn;
	}
	public void setHn(String hn) {
		this.hn = hn;
	}
	public Float getBal() {
		return bal;
	}
	public void setBal(Float bal) {
		this.bal = bal;
	}
	
	
	
}
