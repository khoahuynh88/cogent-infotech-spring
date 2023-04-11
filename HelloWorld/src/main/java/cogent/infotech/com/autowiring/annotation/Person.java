package cogent.infotech.com.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Person {
 Car car;

 //We can apply autowrie anywhere in the class

public Car getCar() {
	return car;
}

@Autowired
public void setCar(Car car) {
	this.car = car;
}

 

 
 
}
