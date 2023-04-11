package cogent.infotech.com.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/qualifier/config.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e.toString());
	}

}