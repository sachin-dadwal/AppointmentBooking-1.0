package doctor;

public class Doctor {

	private String dID;
	private String dName;
	private String dCharge;
	private String dDept;
	private int dDuration;
	private String dEmail;
	private String dPhone;
	private String dStart;
	private String dEnd;

	public Doctor() {

	}

	public Doctor(String dID, String dName, String dCharge, String dDept, int dDuration, String dEmail, String dPhone,
			String dStart, String dEnd) {
		super();
		this.dID = dID;
		this.dName = dName;
		this.dCharge = dCharge;
		this.dDept = dDept;
		this.dDuration = dDuration;
		this.dEmail = dEmail;
		this.dPhone = dPhone;
		this.dStart = dStart;
		this.dEnd = dEnd;
	}

	public String getdID() {
		return dID;
	}

	public void setdID(String dID) {
		this.dID = dID;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdCharge() {
		return dCharge;
	}

	public void setdCharge(String dCharge) {
		this.dCharge = dCharge;
	}

	public String getdDept() {
		return dDept;
	}

	public void setdDept(String dDept) {
		this.dDept = dDept;
	}

	public int getdDuration() {
		return dDuration;
	}

	public void setdDuration(int dDuration) {
		this.dDuration = dDuration;
	}

	public String getdEmail() {
		return dEmail;
	}

	public void setdEmail(String dEmail) {
		this.dEmail = dEmail;
	}

	public String getdPhone() {
		return dPhone;
	}

	public void setdPhone(String dPhone) {
		this.dPhone = dPhone;
	}

	public String getdStart() {
		return dStart;
	}

	public void setdStart(String dStart) {

		this.dStart = dStart;
	}

	public String getdEnd() {

		return dEnd;
	}

	public void setdEnd(String dEnd) {
		this.dEnd = dEnd;
	}

}
