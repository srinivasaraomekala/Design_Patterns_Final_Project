package com.organdonation.organbank;

public class RecipientOrganBank extends WHO {
	public RecipientOrganBank(OrganBank organBank)
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