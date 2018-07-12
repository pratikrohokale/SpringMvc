package com.jpmc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar calender = null;
		int hour = 0;
		String wishMsg = null;
		ModelAndView mav = null;

		// get system date
		calender = Calendar.getInstance();
		hour = calender.get(Calendar.HOUR_OF_DAY);
		// generate wish msg
		if (hour <= 12)
			wishMsg = "Good Morning";
		else if (hour <= 16)
			wishMsg = "Good AfterNoon";
		else if (hour <= 20)
			wishMsg = "Good Evening";
		else
			wishMsg = "Good Night";
		mav = new ModelAndView("result", "wMsg", wishMsg);
		return mav;
	}

}
