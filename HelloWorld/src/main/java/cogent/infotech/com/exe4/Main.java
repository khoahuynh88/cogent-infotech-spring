package cogent.infotech.com.exe4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx = new ClassPathXmlApplicationContext("cogent/infotech/com/exe4/config.xml");
	Customer e = (Customer) ctx.getBean("customer");
	Reservation r=e.getReservation();
	
	System.out.println(r.getId());
	System.out.println(r.getTime());
	}
}
