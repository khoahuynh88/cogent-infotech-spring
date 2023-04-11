package cogent.infotech.com.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
	
	@Bean (name= "person")
	public Person getPerson() {
		Person p = new Person();
		p.setName("Khoa");
		p.setAge(20);
		return p;
	}
		
}
