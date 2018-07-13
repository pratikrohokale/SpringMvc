package com.jpmc.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req1, HttpServletResponse req2) throws Exception {
		Calendar calender = null;
		int hour = 0;
		String wishMsg = null;
		calender = Calendar.getInstance();
		hour = calender.get(Calendar.HOUR_OF_DAY);
		if (hour <= 12) {
			wishMsg = "GM";
		} else if (hour <= 16) {
			wishMsg = "GA";
		} else if (hour <= 20) {
			wishMsg = "GE";
		} else {
			wishMsg = "GN";
		}
		return new ModelAndView("result", "wMsg", wishMsg);
	}// method

}// class
