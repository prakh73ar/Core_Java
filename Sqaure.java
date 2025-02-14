package learning.oops;

public class Sqaure {
	int side; // 0
	String size, color; // null

	void setSqaure(String size, String color, int side) {
		this.size = size;
		this.color = color;
		this.side = side;
	}

	void printDetails() {
		System.out.println("Size color and side of square is " + size + " " + color + " " + side);
	}

	void area() {
		System.out.println("Area of Square " + side * side);
	}

	void perimeter() {
		System.out.println("Perimeter of the square " + 4 * side);
	}

	public static void main(String[] args) {
		System.out.println("--------------------First Object---------------------");
		Sqaure sq = new Sqaure();
		sq.setSqaure("Large", "Red", 4);
		sq.printDetails();
		sq.area();
		sq.perimeter();

		System.out.println("--------------------Another Object---------------------");

		Sqaure s = new Sqaure();

		s.setSqaure("Small", "Blue", 5);
		s.printDetails();
		s.area();
		s.perimeter();

	}

}
