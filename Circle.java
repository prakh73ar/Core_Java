package learning.oops;

public class Circle {

	float radius;

	void setRadius(float r) {
		radius = r;

	}

	void area() {
		double area;
		area = 3.14 * radius * radius;
		System.out.println("Area of Circle " + area);
	}

	void circumference()

	{
		float circumference;
		float pi = 3.14f;
		circumference = 2 * pi * radius;
		System.out.println("Circumference of circle " + circumference);
	}

	void getRadius() {
		System.out.println("Radius of Circle " + radius);
	}

	public static void main(String[] args) {
		Circle c = new Circle();

		c.setRadius(6.6f);
		c.area();
		c.circumference();
		c.getRadius();
	}
}
