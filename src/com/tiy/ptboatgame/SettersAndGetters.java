package com.tiy.ptboatgame;

public class SettersAndGetters<Product> 
{
	private double fileSize;
	private int acres;
	private String color;
	private String phoneNumber;
	private String companyName;
	private String date;
	private boolean lightSwitch = false;
	private double pi;
	private double lightSpeed;
	private String Animal = "dog";
	private String Address = "home";
	private Product[] cleaner;
	
	
	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Product[] getCleaner() {
		return cleaner;
	}

	public void setCleaner(Product[] cleaner) {
		this.cleaner = cleaner;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isLightSwitch() {
		return lightSwitch;
	}

	public void setLightSwitch(boolean lightSwitch) {
		this.lightSwitch = lightSwitch;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getLightSpeed() {
		return lightSpeed;
	}

	public void setLightSpeed(double lightSpeed) {
		this.lightSpeed = lightSpeed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAcres() {
		return acres;
	}

	public void setAcres(int acres) {
		acres = acres;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}

}
