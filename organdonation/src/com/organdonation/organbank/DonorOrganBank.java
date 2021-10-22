package com.organdonation.organbank;

/**
 * Refined abstraction class in Bridge Design Pattern
 * @author Srinivas
 *
 */

public class DonorOrganBank extends WHO {
	
	/**
	 * 
	 * @param organBank abstraction interface reference
	 */
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
