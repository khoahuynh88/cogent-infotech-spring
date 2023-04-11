package cogent.infotech.spring_jdbc.employee.dao;

import cogent.infotech.spring_jdbc.employee.dto.Employee;

public interface EmployeeDAO {
 
	int create (Employee employee);
	int update (Employee employee);
	int delete (int id);
	
}
