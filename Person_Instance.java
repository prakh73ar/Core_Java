package learning.oops;

public class Person_Instance {
	String name;
	String[] phoneNumber;

	void showInfo(String name, String... phone) { // parameter is last and only
		this.name = name;
		int nofOfPhones = phone.length;

		phoneNumber = new String[nofOfPhones];

		for (int i = 0; i < phone.length; i++) {
			phoneNumber[i] = phone[i]; // Initializing instance variables phoneNumber[]
		}

	}

	void personDetails() {
		System.out.println("Name is" + name);
		for (String ph : phoneNumber) {
			System.out.println(ph);
		}
	}

	public static void main(String[] args) {
		Person_Instance p = new Person_Instance();
		p.showInfo("Prakhar", "4536373728", "46646464", "47743838388");
		p.personDetails();
		Person_Instance p1 = new Person_Instance();

		p1.showInfo("Ayush", "4536373728", "477438383");
		p1.personDetails();

	}

}
