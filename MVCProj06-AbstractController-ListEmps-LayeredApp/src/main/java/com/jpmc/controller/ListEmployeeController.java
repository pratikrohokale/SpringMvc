package com.jpmc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.jpmc.dto.EmployeeDTO;
import com.jpmc.service.ListEmployeeService;

public class ListEmployeeController extends AbstractController {

	private ListEmployeeService service;

	public void setService(ListEmployeeService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		List<EmployeeDTO> listDTO = null;
		ModelAndView mav = null;
		// use service
		listDTO = service.getAllEmployees();		
		// prepare mav
		mav = new ModelAndView();
		mav.setViewName("list_emps");
		mav.addObject("listEmps", listDTO);
		return mav;
	}

}
