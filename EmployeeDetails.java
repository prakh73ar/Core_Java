package learning.oops;

import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Salary ");
		double salary = sc.nextDouble();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		sc.nextLine();// when we use a string after int,float,double ...etc we write a sc.nextLine();
						// method
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Employee name is " + name);
		System.out.println("Employee age is " + age);
		System.out.println("Salary is " + salary);

		sc.close();

	}
}
