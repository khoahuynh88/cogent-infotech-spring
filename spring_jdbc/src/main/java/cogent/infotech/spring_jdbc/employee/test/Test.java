package cogent.infotech.spring_jdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cogent.infotech.spring_jdbc.employee.dao.EmployeeDAO;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDao");
		Employee emp= new Employee();
		
	}

}
