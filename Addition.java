package learning.oops;

public class Addition { // this is a utility class & can not make instance variables
	void add(int x, int y) { // these are instance method
		System.out.println("Sum of two integer " + (x + y));
	}

	void add(float x, float y) {
		System.out.println("Sum of two float " + (x + y));
	}

	void add(int x, int y, int z) {
		System.out.println("Sum of three integer " + (x + y + z));
	}

	public static void main(String[] args) {
		Addition sum = new Addition();
		sum.add(5, 7);
		sum.add(5.5f, 6.6f);
		sum.add(4, 5, 6);
	}

}
