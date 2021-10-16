package com.organdonation.applicants;

public class Applicant {

	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String organType;
	private String emailId;
	private String address;
	
	 private static volatile Applicant obj  = null;
	 
	 private Applicant() {}
	 
	 public static Applicant getInstance()
	    {
	        if (obj == null)
	        {
	            synchronized (Applicant.class)
	            {
	                if (obj==null)
	                    obj = new Applicant();
	            }
	        }
	        return obj;
	    }

	public String getSubmittedDetails() {
		return  " FirstName " + this.firstName + " , "+ " LastName " + this.lastName + " , " +" PhoneNumber "
				+ this.phoneNumber + " , " + " Organ Type " + this.organType + " , " + " Email Id " + this.emailId + " , " + " Address " + this.address;

	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setOrganType(String organType) {
		this.organType = organType;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getOrganType() {
		return organType;
	}

	public String getEmailId() {
		return emailId;
	}

	public String getAddress() {
		return address;
	}

	public static Applicant getObj() {
		return obj;
	}
}