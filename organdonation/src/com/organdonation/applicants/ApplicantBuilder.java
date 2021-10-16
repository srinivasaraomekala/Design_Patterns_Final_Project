package com.organdonation.applicants;

public abstract class ApplicantBuilder {

	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String organType;
	protected String emailId;
	protected String address;

	public abstract ApplicantBuilder submitDetails(String firstName, String lastName, String phoneNumber, String organType,
			String emailId, String address);

	public Applicant build() {
		// Singleton Design Pattern implementation always single user instance is retrieved.
		Applicant applicant = Applicant.getInstance();
		applicant.setFirstName(this.firstName);
		applicant.setLastName(this.lastName);	
		applicant.setPhoneNumber(this.phoneNumber);
		applicant.setOrganType(this.organType);
		applicant.setEmailId(this.emailId);
		applicant.setAddress(this.address);
		return applicant;
	}
}