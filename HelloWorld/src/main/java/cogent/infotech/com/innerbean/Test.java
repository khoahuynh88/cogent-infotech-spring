package cogent.infotech.com.innerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/innerbean/config.xml");
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e);
		
	}

}
