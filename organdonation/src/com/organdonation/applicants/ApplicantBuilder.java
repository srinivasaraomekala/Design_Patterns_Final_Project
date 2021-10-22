package com.organdonation.applicants;

/**
 * Singleton Design Pattern implementation always- single Applicant instance is
 * retrieved- Line number 22 Implementation of Builder Design pattern and its
 * build method
 *
 * 
 * @author Srinivas
 * 
 */

public abstract class ApplicantBuilder {

	protected String firstName;
	protected String lastName;
	protected String phoneNumber;
	protected String organType;
	protected String emailId;
	protected String address;

	/**
	 * 
	 * @param firstName FirstName of the applicant
	 * @param lastName  Surname of the applicant
	 * @param phoneNumber Mobile Number of the applicant
	 * @param organType  Organ name 
	 * @param emailId    Personal Email Id
	 * @param address    Residential Address
	 * @return ApplicantBuilder reference
	 */
	public abstract ApplicantBuilder submitDetails(String firstName, String lastName, String phoneNumber,
			String organType, String emailId, String address);

	/**
	 * 
	 * @return applicant object constructed using build method in Builder Design
	 *         pattern
	 */
	public Applicant build() {
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