package com.jpmc.dao;

import java.util.List;

import com.jpmc.bo.EmployeeBO;

public interface ListEmployeeDAO {
	public List<EmployeeBO> retrieveEmployees();
}
