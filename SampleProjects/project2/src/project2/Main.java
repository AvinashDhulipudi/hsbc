package project2;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.show();

		Point p2 = new Point(12, 15);

		p2.show();

		Point p3 = new Point(-40, 55);

		p3.show();
		
		p1.advanceX(130);
		p1.show();

		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(21, 13);
		System.out.println(r1.getArea());
		System.out.println(r1.getPeri());
		
		System.out.println(r2.getArea());
		System.out.println(r2.getPeri());
	}

}
