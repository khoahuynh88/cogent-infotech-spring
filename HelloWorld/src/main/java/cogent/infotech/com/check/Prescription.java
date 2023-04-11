package cogent.infotech.com.check;

import java.util.List;

import org.springframework.beans.factory.annotation.Required;


public class Prescription {
private int id;
private List<String> medicine;
private String patientname;


@Override
public String toString() {
	return "Prescription [id=" + id + ", medicine=" + medicine + ", patientname=" + patientname + "]";
}

@Required
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public List<String> getMedicine() {
	return medicine;
}
public void setMedicine(List<String> medicine) {
	this.medicine = medicine;
}

public String getPatientname() {
	return patientname;
}
public void setPatientname(String patientname) {
	this.patientname = patientname;
}




}
