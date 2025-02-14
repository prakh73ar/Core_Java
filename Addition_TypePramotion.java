package learning.oops;

public class Addition_TypePramotion { // this is a utility class & can not make instance variables

	void add(float x, float y) {
		System.out.println("Sum of two float " + (x + y));
	}

	void add(int x, int y, int z) {
		System.out.println("Sum of three integer " + (x + y + z));
	}

	public static void main(String[] args) {
		Addition_TypePramotion sum = new Addition_TypePramotion();
		sum.add(5, 7); // Type promotion = lower data type get converted into higher data type
		sum.add(5, 6);
		sum.add(4, 5, 6);
	}

}
