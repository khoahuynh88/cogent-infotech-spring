package cogent.infotech.com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		Person p = context.getBean(Person.class);
		System.out.println("Person age"+p.getAge());
		System.out.println("Person naem"+p.getName());
		
	}

}
