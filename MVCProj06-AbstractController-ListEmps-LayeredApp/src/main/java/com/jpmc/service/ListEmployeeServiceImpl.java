package com.jpmc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.jpmc.bo.EmployeeBO;
import com.jpmc.dao.ListEmployeeDAO;
import com.jpmc.dto.EmployeeDTO;

public class ListEmployeeServiceImpl implements ListEmployeeService {

	private ListEmployeeDAO dao;

	public void setDao(ListEmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> listDTO = null;
		List<EmployeeBO> listBO = null;
		EmployeeDTO dto = null;
		listDTO = new ArrayList<>();

		// use dao
		listBO = dao.retrieveEmployees();
		for (EmployeeBO bo : listBO) {
			dto = new EmployeeDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		}

		// prepare litDTO object
		return listDTO;
	}

}
