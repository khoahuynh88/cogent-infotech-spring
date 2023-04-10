package cogent.infotech.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cogent.infotech.com.entity.Employee;
import cogent.infotech.com.service.EmployeeService;

@RestController
public class EmployeeControleer {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/employee")
	public Employee saveEmployee(@Validated @RequestBody Employee employee) {
		
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/employee")
	public List<Employee> fetchDepartmentList(){
		return employeeService.fetchEmployeeList();
	
}
}