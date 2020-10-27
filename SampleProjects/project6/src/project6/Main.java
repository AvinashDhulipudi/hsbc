package project6;

public class Main {

	public static void main(String[] args) {
		Employee e = new Employee("Ramana", "hyderabd", 100, 5000);
		Student s = new Student("Sudhir", "Chennai", 10, 35.5f);

		Person p;

		p = e;
		System.out.println("------------------------------");

		p.display(); // calls display method of Employee

		p = s;
		System.out.println("------------------------------");

		p.display(); // calls display method of Student

	}

}
