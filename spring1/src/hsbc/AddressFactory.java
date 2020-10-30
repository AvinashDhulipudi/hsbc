package hsbc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AddressFactory {

	@Bean(name = "add1")
	public Address getAdd1() {
		return new Address("Building1", "Street1", "Mumbai");
	}

	@Bean(name = "add2")
	public Address getAdd2() {
		return new Address("Building2", "Street2", "Hydearabad");
	}

}

