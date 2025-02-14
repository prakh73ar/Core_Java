package learning.oops;

public class Compare_Overload {
	void compare(int x, int y) {
		if (x > y)
			System.out.println("Grater is x :" + x);
		else
			System.out.println("Grater is y :" + y);

	}

	void compare(char a, char b) {
		/*
		 * int as=(int)a;
		 * int at=(int)b;
		 * if(as>at)
		 */
		if (a > b) {
			System.out.println("Greater is " + a);
		} else {
			System.out.println("Grater is " + b);
		}

	}

	public static void main(String[] args) {
		Compare_Overload compr = new Compare_Overload();
		compr.compare(8, 6);
		compr.compare('e', 'f');
	}

}
