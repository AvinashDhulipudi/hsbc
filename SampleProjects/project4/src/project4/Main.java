package project4;

public class Main {

	public static void main(String[] args) {
		
		int a[]=new int[10];  // array with default values
		
		System.out.println(a.length);
		
		a[3]=100;
		
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
		
		int b[]= {23,34,45,56,67,78};  // initializad array
		
		System.out.println(b.length);
		
		
		int sum=0;
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		  sum = sum+b[i];
		}
		
		System.out.println("Sum is "+sum);

		
	}

}
