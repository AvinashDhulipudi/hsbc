package project2;

public class Rectangle {

	private float length;
	private float breadth;

	public Rectangle() {
		super();
		this.length = 15;
		this.breadth = 10;
	}

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getArea() {
		return length * breadth;
	}

	public float getPeri() {
		return 2 * (length + breadth);
	}

}
