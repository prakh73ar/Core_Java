package learning.oops;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Hello " + name);

		// next takes string as input but doesn't not accept space
		// space is the delimiter or terminating character

		System.out.println("Enter Your Country Name ");
		String country = sc.next();
		System.out.println("Country name is " + country);

		sc.close();
	}

}
