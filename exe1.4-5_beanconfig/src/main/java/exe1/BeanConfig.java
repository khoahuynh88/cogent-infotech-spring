package exe1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class BeanConfig {
	@Bean (name= "person")
	public Person getPerson() {
		Person p= new Person();
		p.setAge(20);
		p.setId(101);
		p.setName("Khoa");
		
		return p;
		
	}
	
	
	
	@Bean (name="product")
	public Product getProduct() {
		Product c = new Product();
		c.setId(101);
		c.setName("product");
		c.setPrice(5000);
		return c;
	}
}

	