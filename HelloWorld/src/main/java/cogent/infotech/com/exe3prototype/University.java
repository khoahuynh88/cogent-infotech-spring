package cogent.infotech.com.exe3prototype;

import org.springframework.beans.factory.annotation.Required;

public class University {
private int id;
private String name;
private String location;

@Required
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
@Override
public String toString() {
	return "University [id=" + id + ", name=" + name + ", location=" + location + "]";
}


}
