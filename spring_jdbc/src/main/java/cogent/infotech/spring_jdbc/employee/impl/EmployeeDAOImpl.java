package cogent.infotech.spring_jdbc.employee.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;


import cogent.infotech.spring_jdbc.employee.dao.EmployeeDAO;
import cogent.infotech.spring_jdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDAOImpl implements EmployeeDAO{

		@Autowired
		private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee employee) {
		// TODO Auto-generated method stub
		String sql= 
		return 0;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
