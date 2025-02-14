package learning.oops;

public class VArg {
	void addition(int... num) // it will create dynamic array
	{
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum = sum + num[i];
		}
		System.out.println("Sum of " + num.length + " Numbers is " + sum);
	}

	public static void main(String[] args) {
		VArg ob = new VArg();
		ob.addition(2, 5); // passing two arguments
		ob.addition(3, 4, 5, 6); // passing four arguments
	}

}
