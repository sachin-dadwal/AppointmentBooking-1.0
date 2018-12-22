package patient;

import java.time.LocalTime;

public class Patient 
{
	private String pID;
	private String pName;
	private String pAge;
	private LocalTime pTime;
	private String pMobilenumber;
	private String pEmail;
	
	
public Patient()
{}
public Patient(String pID, String pName, String pAge, LocalTime pTime, String pMobilenumber, String pEmail) {
	super();
	this.pID = pID;
	this.pName = pName;
	this.pAge = pAge;
	this.pTime = pTime;
	this.pMobilenumber = pMobilenumber;
	this.pEmail = pEmail;
}




public String getpID() {
	return pID;
}


public void setpID(String pID) {
	this.pID = pID;
}


public String getpName() {
	return pName;
}


public void setpName(String pName) {
	this.pName = pName;
}


public String getpAge() {
	return pAge;
}


public void setpAge(String pAge) {
	this.pAge = pAge;
}


public LocalTime getpTime() {
	return pTime;
}


public void setpTime(LocalTime pTime) {
	this.pTime = pTime;
}


public String getpMobilenumber() {
	return pMobilenumber;
}


public void setpMobilenumber(String pMobilenumber) {
	this.pMobilenumber = pMobilenumber;
}


public String getpEmail() {
	return pEmail;
}


public void setpEmail(String pEmail) {
	this.pEmail = pEmail;
}


}
