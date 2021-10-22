package com.organdonation.organbank;

/**
 * Abstraction class in Bridge Design Pattern
 * 
 * @author Srinivas
 *
 */
public abstract class WHO {

	protected OrganBank organBank;

	/**
	 * 
	 * @param organBank
	 */
	protected WHO(OrganBank organBank) {
		this.organBank = organBank;

	}

	abstract public void getConfirmation();
}