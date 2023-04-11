package cogent.infotech.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Greeting g = (Greeting) ctx.getBean("hello");
		String str = g.message();
		System.out.println(str);

		// Bean
		Employee e = (Employee) ctx.getBean("emp");
		System.out.println("Emp no:" + e.getId());
		System.out.println("Emp name: " + e.getName());
		System.out.println();

		// Constructor or Primitive dependency
		Person p = (Person) ctx.getBean("person");
		System.out.println(" Person id " + p.getId() + "\n Person name " + p.getName() + "\n Person age " + p.getAge());
		System.out.println();

		// Collection dependency: List
		Hospital h = (Hospital) ctx.getBean("hospital");
		System.out.println("Hospital name:" + h.getName());
		System.out.println("Hospital dep: " + h.getDepartment());
		System.out.println(h.getDepartment().getClass());
		System.out.println();

		// Map collection
		Customer c = (Customer) ctx.getBean("customer");
		System.out.println(c.getProduct());
		System.out.println(c.getProduct().getClass());
		System.out.println();

		// Set collection
		CarDealer cd = (CarDealer) ctx.getBean("cardealer");
		System.out.println(cd.getName());
		System.out.println(cd.getModels());
		System.out.println(cd.getModels().getClass());
		System.out.println();

		// Reference dependency
		Student st = (Student) ctx.getBean("student");
		System.out.println(st);
		System.out.println(st.getScores().getClass());
		System.out.println(st.getScores());
		System.out.println();

	}

}
