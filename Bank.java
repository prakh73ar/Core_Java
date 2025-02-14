package learning.oops;

public class Bank {
	String name;
	String acno;
	String type;
	double balance;

	void setDetails(String name, String acno, String type, double balance) {
		this.name = name;
		this.acno = acno;
		this.type = type;
		this.balance = balance;
	}

	void deposit(int amount) {
		System.out.println("Your disposit amount is :" + amount);
		balance = balance + amount;
		System.out.println("After deposit your balance is :" + balance);

	}

	void withdraw(int amount) {
		System.out.println("Withdrwa amount is :" + amount);
		if (amount <= balance) {
			balance = balance - amount;
			System.out.println("After withdraw your balance is :" + balance);
		} else {
			System.out.println("Low Balance");
		}
	}

	void printDetails() {
		System.out.println("Account Holder Name :" + name);
		System.out.println("Account number of " + name + " is " + acno);
		System.out.println("Account Type of " + name + " is " + type);
		System.out.println(name + " balance of your account is " + balance);

	}

	public static void main(String[] args) {
		Bank money = new Bank();
		money.setDetails("Prakhar", "3456456", "Current", 76000);
		money.printDetails();
		money.deposit(75345);
		money.withdraw(34000);

	}

}
