package learning.oops;

import java.util.Scanner;

public class Char_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your Grade");
		char grade = sc.next().charAt(0);
		System.out.println("You have scored :" + grade);
		sc.close();
	}

}
