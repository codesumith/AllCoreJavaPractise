package com.sumith.human_heart;

public class Heart {
	
	private int heartrate;
	private String bloodcolor;
	
	
	public Heart(int heartrate, String bloodcolor) {
		super();
		this.heartrate = heartrate;
		this.bloodcolor = bloodcolor;
	}
	
	public void Heartrate(int rate) {
		
		this.heartrate = rate;
		System.out.println("my heart is"+rate);
		
	}
	
	public void blood(String colour) {
		
		this.bloodcolor=colour;
		System.out.println("My blood is pumping in"+colour+"colour");
	}

	@Override
	public String toString() {
		return "Heart [heartrate=" + heartrate + ", bloodcolor=" + bloodcolor + "]";
	}

	
	
}
