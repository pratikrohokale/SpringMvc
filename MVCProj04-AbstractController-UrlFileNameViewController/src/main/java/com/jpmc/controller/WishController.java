package com.jpmc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// TODO Auto-generated method stub
		Calendar calender = null;
		int hour = 0;
		String wishMsg = null;
		ModelAndView mav = null;

		calender = Calendar.getInstance();
		hour = calender.get(Calendar.HOUR_OF_DAY);
		if (hour < 12)
			wishMsg = "GM";
		else if (hour < 16)
			wishMsg = "GF";
		else if (hour < 20)
			wishMsg = "GE";
		else
			wishMsg = "GN";
		// create new ModelAndView object
		mav = new ModelAndView();
		mav.setViewName("result");
		mav.addObject("wMsg", wishMsg);
		return mav;
	}

}
