package com.organdonation.organbank;

public abstract class WHO {

	protected OrganBank organBank;

	protected WHO(OrganBank organBank)
	{
		this.organBank = organBank;
	
	}

	abstract public void getConfirmation();
}