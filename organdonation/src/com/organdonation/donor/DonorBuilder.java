package com.organdonation.donor;

import com.organdonation.applicants.ApplicantBuilder;
import com.organdonation.applicants.Applicants;
import com.organdonation.organbank.OrganBank;

public class DonorBuilder extends ApplicantBuilder implements Applicants,OrganBank {
		

		private String firstName;
		private String phoneNumber;
		private String organType;

		public DonorBuilder() {

		}

		public DonorBuilder(String firstName, String lastName, String phoneNumber, String organType, String emailId,
				String address) {
			this.firstName = firstName;
			this.phoneNumber = phoneNumber;
			this.organType = organType;

		}

		@Override
		public void getApplicants() {
		System.out.println("Donar "+this.firstName+ " , "+this.phoneNumber+ " is ready to donate organ : "+ this.organType);
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
		public void message()
		{
			System.out.print(" DONOR " );
		}
}