package com.organdonation.recipient;


import com.organdonation.applicants.ApplicantBuilder;
import com.organdonation.applicants.Applicants;
import com.organdonation.organbank.OrganBank;

public class RecipientBuilder extends ApplicantBuilder implements Applicants, OrganBank {

	private String firstName;
	private String lastname;
	private String organType;

	public RecipientBuilder() {

	}

	/**
	 * 
	 * @param firstName FirstName of the applicant
	 * @param lastName  Surname of the applicant
	 * @param phoneNumber Mobile Number of the applicant
	 * @param organType  Organ name 
	 * @param emailId    Personal Email Id
	 * @param address    Residential Address
	 * 
	 */

	public RecipientBuilder(String firstName, String lastName, String phoneNumber, String organType, String emailId,
			String address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.organType = organType;
	}

	@Override
	public void getApplicants() {
		System.out
				.println("Recipient  " + this.firstName + " , " + this.lastName + " is looking for " + this.organType);
	}

	@Override
	public ApplicantBuilder submitDetails(String firstName, String lastName, String phoneNumber, String organType,
			String emailId, String address) {
		super.firstName = firstName;
		super.lastName = lastName;
		super.phoneNumber = phoneNumber;
		super.organType = organType;
		super.emailId = emailId;
		super.address = address;
		return this;
	}

	@Override
	public void message() {
		System.out.print(" RECIPIENT ");
	}

}