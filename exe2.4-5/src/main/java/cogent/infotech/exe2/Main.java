package cogent.infotech.exe2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AbstractApplicationContext atx = new ClassPathXmlApplicationContext("config.xml");
		Employee s = (Employee) atx.getBean("employee");
		System.out.println(s.toString());
		atx.registerShutdownHook();
	}

}
