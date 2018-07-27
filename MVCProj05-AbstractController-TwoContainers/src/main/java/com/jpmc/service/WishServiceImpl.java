package com.jpmc.service;

import java.util.Calendar;

public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMsg() {
		Calendar calender = null;
		int hours = 0;
		String wishMsg = null;
		// get calender object
		calender = Calendar.getInstance();
		hours = calender.get(Calendar.HOUR_OF_DAY);
		if (hours <= 12)
			wishMsg = "GM";
		else if (hours <= 16)
			wishMsg = "GA";
		else if (hours <= 20)
			wishMsg = "GE";
		else
			wishMsg = "GN";
		return wishMsg;
	}

}
