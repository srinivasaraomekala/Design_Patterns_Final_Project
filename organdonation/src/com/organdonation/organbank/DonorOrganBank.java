package com.organdonation.organbank;

public class DonorOrganBank extends WHO {
	public DonorOrganBank(OrganBank organBank)
	{
		super(organBank);
	}

	@Override
	public void getConfirmation()
	{
		System.out.print("User registered with OrganBank as a ");
		organBank.message();
		
	}
}
