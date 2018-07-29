package com.jpmc.service;

public interface BankService {
	public float calcSimpleIntrAmt(float pAmt,float rate,float time);
	public boolean isAccountBlocked(int accNo);
}
