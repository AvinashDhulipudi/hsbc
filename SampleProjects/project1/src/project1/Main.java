package project1;

public class Main {

	public static void main(String[] args) {

		Employee e1 = new Employee(100, "Ramana"); // calling second constructor

		e1.show();

		Employee e2 = new Employee(200, "Kishore Kumar", 5000); // calling first constructor

		e2.show();
		e2.increment(15);
		e2.show();
	}

}
