package project1;

public class Employee {

	private int empId;
	private String name;
	private float salary;

	public Employee(int empId, String name, float salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
		salary = 10000;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public void increment(int per) {
		salary = salary + salary * per / 100;
	}

	public void show() {
		System.out.println("Emp id: " + empId);
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

}
