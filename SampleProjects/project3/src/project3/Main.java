package project3;

public class Main {

	public static void main(String[] args) {

		/*
		 * String s1="Hyderabad"; String s2 = new String("Hyderabad");
		 * 
		 * System.out.println(s1.length());
		 * 
		 * System.out.println(s1.toUpperCase());
		 * 
		 * System.out.println(s1);
		 * 
		 * System.out.println(s1.indexOf('y'));
		 * 
		 * System.out.println(s1.indexOf('V'));
		 * 
		 * System.out.println(s1.charAt(3));
		 */

		StringBuffer sb = new StringBuffer("my name is Ramana");

		System.out.println(sb);
		sb.append(" and I live in Hyderabad");
		System.out.println(sb);
		sb.delete(0, 3);

		sb.replace(8, 14, "Sidhir Kumar");

		System.out.println(sb);

		System.out.println(sb);

		StringBuilder sb1 = new StringBuilder();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			sb1.append(ch);
		}

		System.out.println(sb1);

	}

}
