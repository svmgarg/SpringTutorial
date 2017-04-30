package com.basic.autowire;

public class ContactInformation {

	private String mobileNumber;
	private String emailId;
	
	public ContactInformation(){
		
	}
	public ContactInformation(String mobileNumber, String emailId) {
		super();
		this.mobileNumber = mobileNumber;
		this.emailId = emailId;
	}
	
	 
	
	public String getMobileNumber() {
		return mobileNumber;
	}



	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}



	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "ContactInformation [mobileNumber=" + mobileNumber + ", emailId=" + emailId + "]";
	}
	
	
	
}
