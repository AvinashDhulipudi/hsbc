package project2;

public class Point {

	private int x;
	private int y;

	public Point() {
		x = y = 0;
	}

	public Point(int x, int y) {
		super();

		if (x < 0) {
			this.x = 0;
		} else {
			if (x > 79)
				this.x = 79;
			else
				this.x = x;
		}

		if (y < 0)
			this.y = 0;
		else {
			if (y > 19)
				this.y = 19;
			else
				this.y = y;
		}
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		if (x < 0)
			this.x = 0;
		else {
			if (x > 79)
				this.x = 79;
			else
				this.x = x;
		}
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		if (y < 0)
			this.y = 0;
		else {
			if (y > 19)
				this.y = 19;
			else
				this.y = y;
		}
	}

	public void advanceX(int n) {
		x = x + n;

		if (x > 79)
			x = 79;
	}

	public void show() {
		System.out.println("(" + x + ", " + y + ")");
	}
}
