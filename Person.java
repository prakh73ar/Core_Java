package learning.oops;

public class Person {
	void showInfo(String name, String... phone) { // parameter is last and only
		System.out.println("Name of Person" + name);

		// Enhanced for loop
		// this loop says don't need to check condition and no updation
		// it will move only forward
		// it cannot go back
		//for( String ph:phone)
		for (String ph : phone) {
			System.out.println("Phone Number :" + ph);
		}

	}

	public static void main(String[] args) {
		Person p = new Person();
		p.showInfo("Prakhar", "4536373728", "46646464", "47743838388");
		p.showInfo("Ayush", "4536373728", "477438383");
	}

}
