package cogent.infotech.com.check;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/check/config.xml");
		Prescription p= (Prescription) ctx.getBean("prescription");
		System.out.println(p.toString());
	}

}
