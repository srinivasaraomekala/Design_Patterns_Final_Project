package com.organdonation.main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.organdonation.applicants.Applicant;
import com.organdonation.applicants.ApplicantBuilder;
import com.organdonation.applicants.TotalApplicants;
import com.organdonation.donor.DonorBuilder;
import com.organdonation.organbank.DonorOrganBank;
import com.organdonation.organbank.RecipientOrganBank;
import com.organdonation.organbank.WHO;
import com.organdonation.recipient.RecipientBuilder;

public class OrganDonationApplication {

		static String firstName;
		static String LastName;
		static String phoneNumber;
		static String organType;
		static String emailId;
		static String address;
		static String userType;

		static Pattern p;
		static Matcher m;

		public static void main(String[] args) {
			String repeat = "No";
			TotalApplicants totalApplicants = new TotalApplicants();
			while (true) {
				@SuppressWarnings("resource")
				Scanner in = new Scanner(System.in);
				System.out.println("Are you a Donor or Recipient of Organ ??");
				userType = in.nextLine();
				if (!userType.equalsIgnoreCase("Donor") && !userType.equalsIgnoreCase("Recipient")) {
					do {
						System.out.println("Invaid Input- Retry- Please enter either Donor or Recipient");
						userType = in.nextLine();
					} while (!userType.equalsIgnoreCase("Donor") && !userType.equalsIgnoreCase("Recipient"));
				}
				System.out.println("FirstName ??");
				firstName = in.next();
				System.out.println("LastName ??");
				LastName = in.next();
				System.out.println("Phone Number ??");
				phoneNumber = in.next();
				System.out.println("Organ Type ??");
				organType = in.next();

				System.out.println("Email Id ??");
				emailId = in.next();

				p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
				m = p.matcher(emailId);
				while (!m.matches()) {
					System.out.println("Email format incorrect - retry");
					emailId = in.next();
					m = p.matcher(emailId);
				}

				System.out.println("Address ??");
				address = in.next();

				if (userType.equalsIgnoreCase("Donor")) {
					TotalApplicants donarApplicants = new TotalApplicants();
					
					// Builder Pattern implementation using its build method
					ApplicantBuilder donor = new DonorBuilder();
					Applicant donorDetails = donor.submitDetails(firstName, LastName, phoneNumber, organType, emailId, address)
							.build();
					System.out.println("Details submitted !!!"+donorDetails.getSubmittedDetails());
				
					//Composite Design Pattern Implementation to get total applicants data - in this case Donor
					
					DonorBuilder donors = new DonorBuilder(firstName, LastName, phoneNumber, organType, emailId, address);
					donarApplicants.addDonors(donors);
				    totalApplicants.addDonors(donarApplicants); //Composite class method to add child components
					   WHO donorsInformation = new DonorOrganBank(new DonorBuilder());
						donorsInformation.getConfirmation();
						System.out.println("\n");
				 
				}

				else if (userType.equalsIgnoreCase("Recipient")) {
					TotalApplicants recipientApplicants = new TotalApplicants();
					
					// Builder Pattern implementation using its build method
					ApplicantBuilder recipient = new RecipientBuilder();
					Applicant recepientDetails = recipient
							.submitDetails(firstName, LastName, phoneNumber, organType, emailId, address).build();
					System.out.println("Details submitted !!!"+recepientDetails.getSubmittedDetails());
					
					//Composite Design Pattern Implementation to get total applicants data - in this case Recipient
					RecipientBuilder recipients = new RecipientBuilder(firstName, LastName, phoneNumber, organType, emailId, address);
					recipientApplicants.addRecipients(recipients);
				    totalApplicants.addRecipients(recipientApplicants); //Composite class method to add child components
				    WHO recipientsInformation = new RecipientOrganBank(new RecipientBuilder());
					recipientsInformation.getConfirmation();
					System.out.println("\n");
				}

				System.out.println("Do you want to continue submitting another profile Yes/ NO ??");
				repeat = in.next();
				if (!repeat.equalsIgnoreCase("Yes") && !repeat.equalsIgnoreCase("No")) {
					do {
						System.out.println("invalid option received- try again");
						System.out.println("Do you want to continue submitting another profile Yes/NO ??");
						repeat = in.next();
						if (repeat.equalsIgnoreCase("Yes")) {
							repeat = "Yes";
							break;
						} else if (repeat.equalsIgnoreCase("No")) {
							   totalApplicants.getApplicants(); //Composite class method to get child components data
							System.out.println("Bye !!!");
							System.exit(1);
						}

					} while (!repeat.equalsIgnoreCase("Yes") && !repeat.equalsIgnoreCase("No"));

				} else {
					if (repeat.equalsIgnoreCase("Yes")) {
						continue;
					} else if (repeat.equalsIgnoreCase("No")) {
						   totalApplicants.getApplicants(); //Composite class method to get child components data
						System.out.println("Thank You !!!");
						System.exit(0);

					}

				}
				if (repeat.equalsIgnoreCase("Yes"))
					continue;

			}

		}

	}