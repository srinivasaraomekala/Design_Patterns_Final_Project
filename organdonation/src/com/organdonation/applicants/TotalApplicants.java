package com.organdonation.applicants;

import java.util.ArrayList;
import java.util.List;

public class TotalApplicants implements Applicants {

		private List<Applicants> applicantsList=new ArrayList<Applicants>();
		
		@Override
		public void getApplicants() {

			for(Applicants applicant1 : applicantsList)
			{
				applicant1.getApplicants();
			}
			
		}
		
		public void addDonors(Applicants donor)
		{
			applicantsList.add(donor);
		}
		
		public void addRecipients(Applicants recipients)
		{
			applicantsList.add(recipients);
		}

	}