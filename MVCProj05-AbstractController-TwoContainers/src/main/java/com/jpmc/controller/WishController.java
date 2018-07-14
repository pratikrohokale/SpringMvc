package com.jpmc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.jpmc.service.WishService;

public class WishController extends AbstractController {

	private WishService service;
	String wMsg = null;

	public void setService(WishService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// use service
		wMsg = service.generateWishMsg();
		return new ModelAndView("result", "wishMsg", wMsg);
	}//method

}//class
