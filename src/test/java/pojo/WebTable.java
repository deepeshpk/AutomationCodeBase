package pojo;

public class WebTable {

	private String fname;
	private String lname;
	private String age;
	private String mail;
	private String salary;
	private String dept;
	
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
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "WebTable [fname=" + fname + ", lname=" + lname + ", age=" + age + ", mail=" + mail + ", salary="
				+ salary + ", dept=" + dept + "]";
	}
	
	
}
