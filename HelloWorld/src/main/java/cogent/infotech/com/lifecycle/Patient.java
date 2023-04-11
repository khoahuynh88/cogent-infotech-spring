package cogent.infotech.com.lifecycle;

//import org.springframework.beans.factory.DisposableBean;
//import org.springframework.beans.factory.InitializingBean;
import javax.annotation.*;
public class Patient  {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
	
	@PostConstruct
	public void init() {System.out.println("Inside init method");}
	
	@PreDestroy
	public void destroy() {System.out.println("Inside destroy method");}

	/*
	 * @Override public void afterPropertiesSet() throws Exception { // TODO
	 * Auto-generated method stub System.out.println("after properties set method");
	 * }
	 * 
	 * @Override public void destroy() throws Exception { // TODO Auto-generated
	 * method stub System.out.println("Inside destroy method"); }
	 */
}
