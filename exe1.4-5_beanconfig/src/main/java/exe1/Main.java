package exe1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	Person p = (Person) context.getBean("person");
	System.out.println("Person age "+p.getAge());
	System.out.println("Person naem "+p.getName());
	System.out.println("Persont id "+ p.getId() );
	
	
	Product c = (Product) context.getBean("product");
	System.out.println("Product name "+ c.getName());
	System.out.println("Product id " + c.getId());
	System.out.println("Product price "+ c.getPrice());
}
}
