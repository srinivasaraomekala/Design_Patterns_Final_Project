package com.organdonation.applicants;

import java.util.ArrayList;
import java.util.List;

public class TotalApplicants implements Applicants {

	private List<Applicants> applicantsList = new ArrayList<Applicants>();

	@Override
	public void getApplicants() {

		for (Applicants applicant1 : applicantsList) {
			applicant1.getApplicants();
		}

	}

	/**
	 * 
	 * @param donor  Donor applicant object that contains all the fields information given in the form
	 */
	public void addDonors(Applicants donor) {
		applicantsList.add(donor);
	}

	/**
	 * 
	 * @param recipients Recipient applicant object that contains all the fields information given in the form
	 */
	public void addRecipients(Applicants recipients) {
		applicantsList.add(recipients);
	}

}