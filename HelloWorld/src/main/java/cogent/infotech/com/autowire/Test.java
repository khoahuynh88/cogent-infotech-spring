package cogent.infotech.com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/autowire/config.xml");
		Person p= (Person) ctx.getBean("person");
		Car car=p.getCar();
		Address add=p.getAdd();
		System.out.println("**************Address**********");
		System.out.println("House no "+ add.getHno()+ " street name "+add.getStreet()+ " city name " +add.getCity());
		System.out.println("***********Car************");
		System.out.println("Car model"+ car.getModel() +" car pricce "+car.getPrice());
	}

}
