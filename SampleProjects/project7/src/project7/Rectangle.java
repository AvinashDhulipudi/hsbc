package project7;

public class Rectangle implements Shape {

	private float length;
	private float breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float getArea() {

		return length * breadth;
	}

	public float getPerimeter() {

		return 2 * (length + breadth);
	}

}
