package com.csc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Calendar cal = null;
		String wishMsg = null;
		int hour = 0;
		cal = Calendar.getInstance();
		// get current hour
		hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour <= 12)
			wishMsg = "Good Morning";
		else if (hour <= 16)
			wishMsg = "Good AfterNoon";
		else if (hour <= 20)
			wishMsg = "Good Evening";
		else
			wishMsg = "Good Night";

		ModelAndView mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wMsg", wishMsg);
		return mav;
	}

}
