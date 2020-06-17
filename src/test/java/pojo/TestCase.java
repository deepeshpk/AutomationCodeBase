package pojo;

public class TestCase {
	
	private String tcID;
	private String userName;
	private String password;
	
	private String fname;
	private String lname;
	private String age;
	private String mail;
	private String salary;
	
	
	public String scenario;
	
	public String getTcID() {
		return tcID;
	}
	public void setTcID(String testcaseid) {
		this.tcID = testcaseid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String usernameofemp) {
		this.userName = usernameofemp;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String pwd) {
		this.password = pwd;
	}
	public String getScenario() {
		return scenario;
	}
	public void setScenario(String scenario) {
		this.scenario = scenario;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "TestCase [tcID=" + tcID + ", userName=" + userName + ", password=" + password + ", fname=" + fname
				+ ", lname=" + lname + ", age=" + age + ", mail=" + mail + ", salary=" + salary + ", scenario="
				+ scenario + "]";
	}
	
	
	
	
	

}
