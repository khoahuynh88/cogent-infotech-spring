package cogent.infotech.com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ClassPathXmlApplicationContext ctx = new
		 * ClassPathXmlApplicationContext("cogent/infotech/com/lifecycle/config.xml");
		 * Patient p = (Patient) ctx.getBean("patient");
		 * System.out.println(p.toString());
		 */
		
		AbstractApplicationContext atx = new ClassPathXmlApplicationContext("cogent/infotech/com/lifecycle/config.xml");
		Patient s = (Patient) atx.getBean("patient");
		System.out.println(s.toString());
		atx.registerShutdownHook();
	}

}
