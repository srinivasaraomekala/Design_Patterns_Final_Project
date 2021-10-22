package com.organdonation.unittests;



import org.junit.Assert;
import org.junit.Test;

import com.organdonation.applicants.Applicant;
import com.organdonation.applicants.ApplicantBuilder;
import com.organdonation.donor.DonorBuilder;
import com.organdonation.recipient.RecipientBuilder;

/*
 * Test cases to verify the submission of Donor and Recipient details received as input using Builder design pattern at Lines 27 & 37
 */

public class RegistrationBuilderPatternTest {

	private final String firstName = "Micheal";
	private final String lastName = "Yardy";
	private final String phoneNumber = "123456789";
	private final String organType = "Heart";
	private final String emailId = "my@au.com";
	private final String address = "NewYork";

	@Test
	public void TestDonorRegistration() {
		ApplicantBuilder donor = new DonorBuilder();
		Applicant recepientDetails = donor.submitDetails(firstName, lastName, phoneNumber, organType, emailId, address)
				.build();
		Assert.assertEquals(this.firstName, recepientDetails.getFirstName());
		Assert.assertEquals(this.address, recepientDetails.getAddress());
	}

	@Test
	public void TestRecipientRegistration() {
		ApplicantBuilder recipient = new RecipientBuilder();
		Applicant recepientDetails = recipient
				.submitDetails(firstName, lastName, phoneNumber, organType, emailId, address).build();
		Assert.assertEquals(this.lastName, recepientDetails.getLastName());
		Assert.assertEquals(this.phoneNumber, recepientDetails.getPhoneNumber());
	}

}
