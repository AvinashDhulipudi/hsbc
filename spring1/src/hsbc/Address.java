package hsbc;

import org.springframework.stereotype.Component;


public class Address {

	private String building = "Building1";
	private String Street ="Abc Street";
	private String city = "Hyderabad";

	public Address() {

	}
	
	public Address(String building, String street, String city) {
		super();
		this.building = building;
		Street = street;
		this.city = city;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [building=" + building + ", Street=" + Street + ", city=" + city + "]";
	}

}
