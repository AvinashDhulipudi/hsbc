package spring.trg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");

        Employee e1= (Employee)  ctx.getBean("emp4");
        
        System.out.println(e1);
	}

}
