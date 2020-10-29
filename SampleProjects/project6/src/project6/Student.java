package project6;

public class Student extends Person {
	private int studentId;
	private float marks;

	public Student(String name, String address, int studentId, float marks) {
		super(name, address);
		this.studentId = studentId;
		this.marks = marks;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentd) {
		this.studentId = studentId;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Student Id: " + studentId);
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		System.out.println("Marks: " + marks);
	}

}
