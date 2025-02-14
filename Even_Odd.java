package learning.oops;

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int number = sc.nextInt();
		if (number % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		sc.close();
	}

}
