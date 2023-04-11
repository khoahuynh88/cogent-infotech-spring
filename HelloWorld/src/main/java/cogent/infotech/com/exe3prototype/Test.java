package cogent.infotech.com.exe3prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/exe3prototype/config.xml");
		University u1 = (University) ctx.getBean("university");
		System.out.println(u1.hashCode());
		University u2 = (University) ctx.getBean("university");
		System.out.println(u2.hashCode());
	}

}
