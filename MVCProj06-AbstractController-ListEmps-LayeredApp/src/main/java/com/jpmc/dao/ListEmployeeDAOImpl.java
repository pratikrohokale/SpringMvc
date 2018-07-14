package com.jpmc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.jpmc.bo.EmployeeBO;

public class ListEmployeeDAOImpl implements ListEmployeeDAO {

	private static final String GET_ALL_EMPS = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP ORDER BY EMPNO";
	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> retrieveEmployees() {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_ALL_EMPS, new EmpListExtractor());
		return listBO;
	}

	private class EmpListExtractor implements ResultSetExtractor<List<EmployeeBO>> {

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO = null;
			EmployeeBO bo = null;
			listBO = new ArrayList<EmployeeBO>();
			// copy rs objects in to listBO
			while (rs.next()) {
				bo = new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setDesg(rs.getString(3));
				bo.setSalary(rs.getInt(4));
				// add bo to listBO
				listBO.add(bo);
			} // while
			return listBO;
		}// method

	}// inner class

}// outer class
