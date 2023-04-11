package cogent.infotech.com.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowiring/annotation/config.xml");
		
		Person p = (Person) ctx.getBean("person");
		Car car = p.getCar();
		
		System.out.println("***********Car*******");
		System.out.println("Car model "+car.getModel());
		System.out.println("Car price " +car.getPrice());
	}

}
