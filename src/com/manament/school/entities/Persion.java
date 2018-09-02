package com.manament.school.entities;

public abstract class Persion {
	protected long persionId;
	protected String firstName;
	protected String midleName;
	protected String lastName;
	protected String fullName;
	protected int ages;
	protected Address address;
	protected String email;
	protected String phoneNumber;
	
	
	public long getPersionId() {
		return persionId;
	}
	public void setPersionId(long persionId) {
		this.persionId = persionId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMidleName() {
		return midleName;
	}
	public void setMidleName(String midleName) {
		this.midleName = midleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
}
