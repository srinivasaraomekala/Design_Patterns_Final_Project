package com.organdonation.unittests;


import org.junit.Assert;
import org.junit.Test;

import com.organdonation.applicants.Applicant;

public class RegistrationSingleTonPatternTest extends Thread {

	Applicant singletonObj = Applicant.getInstance();
	Applicant objByThread = null;

	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("Thread " + Thread.currentThread().getName() + "requesting instance");
			objByThread = Applicant.getInstance();
			Assert.assertEquals(singletonObj, objByThread); // Both the threads retrieve same user obj when compared
															// with actual obj-
															// that verifies Singleton rule- always returns single
															// instance
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	@Test
	public void TestUserSingleTon() {
		RegistrationSingleTonPatternTest t1 = new RegistrationSingleTonPatternTest();
		RegistrationSingleTonPatternTest t2 = new RegistrationSingleTonPatternTest();
		t1.start();
		t2.start();
	}

}