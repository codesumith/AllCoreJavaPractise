package com.sumith.laptop;

public class MotherBoard {

	private String chipType;
	private String  storage;
	private String rom;
	
	
	
	
	public MotherBoard(String chipType, String storage, String rom) {
		super();
		this.chipType = chipType;
		this.storage = storage;
		this.rom = rom;
	}




	public String getChipType() {
		return chipType;
	}




	public void setChipType(String chipType) {
		this.chipType = chipType;
	}




	public String getStorage() {
		return storage;
	}




	public void setStorage(String storage) {
		this.storage = storage;
	}




	public String getRom() {
		return rom;
	}




	public void setRom(String rom) {
		this.rom = rom;
	}




	@Override
	public String toString() {
		return "MotherBoard [chipType=" + chipType + ", Storage=" + storage + ", Rom=" + rom + "]";
	}
	
	
	
	
	
}
