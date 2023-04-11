package cogent.infotech.exe2;

public class Employee {

	private int id;

	
	
	


	
public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}

public void init() {System.out.println("HI");}
	
	public void destroy() {System.out.println("Bye");}
}
