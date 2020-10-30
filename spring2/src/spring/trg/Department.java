package spring.trg;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	private int deparmentId = 10;
	private String name = "Finance";
	private String address = "Delhi";

	public Department() {

	}

	@Override
	public String toString() {
		return "DeparmentId=" + deparmentId + ", name=" + name + ", address=" + address;
	}

}
