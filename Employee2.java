
public class Employee2 {
	private String name;
	private int empId;
	private int age;
	private double salary;
	private String address;
	
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", age=" + age + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
	public Employee2() {
		// TODO Auto-generated constructor stub
	}
	

}
