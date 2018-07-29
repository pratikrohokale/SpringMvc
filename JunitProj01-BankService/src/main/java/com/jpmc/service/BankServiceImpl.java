package com.jpmc.service;

public class BankServiceImpl implements BankService {

	@Override
	public float calcSimpleIntrAmt(float pAmt, float rate, float time) {
		System.out.println("BankServiceImpl:calcSimpleIntrAmt(-,-,-)");
		try {

			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		if (pAmt <= 0 || rate <= 0 || time <= 0)
			throw new IllegalArgumentException("Invalid Inputs");
		float intrAmt = 0.0f;
		intrAmt = (pAmt * rate * time) / 100.0f;
		return intrAmt;
	}

	@Override
	public boolean isAccountBlocked(int accNo) {
		if (accNo <= 0)
			throw new IllegalArgumentException("Invalid account Number");
		return false;
	}

}
