# Design_Patterns_Final_Project

Main Class to run : OrganDonationApplication.java

Implemented Design Patterns :
Builder --> Files to refer OrganDonationApplication.java, Applicant.java, ApplicantBuilder.java, DonorBuilder and RecipientBuilder.java

Singleton --> Refer Applicant.java

Composite --> Refer OrganDonationApplication.java, Applicants.java (Component), TotalApplicants.java(Composite), leaf's (DonorBuilder and RecipientBuilder.java)

Bridge --> Refer OrganDonationApplication.java, WHO (abstraction class), DonorOrganBank & Recipient OrganBank (Refined abstraction), OrganBank (Interface as IMPLEMENTOR)
           , DonorBuilder and RecipientBuilder.java (as Concrete Implementations)
------------------- In Progress ---------------------------
