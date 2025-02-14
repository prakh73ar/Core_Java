package learning.oops;

public class ElectricityBil {
	String name;
	long consumerno;
	int unitconsumed;
	double totalamount;

	void setInfo(String name, long consumerno, int unitconsumed) {
		this.name = name;
		this.consumerno = consumerno;
		this.unitconsumed = unitconsumed;
	}

	void calculateAmount()

	{

		if (unitconsumed <= 100) {
			totalamount = unitconsumed * 1.20;
		} else if (unitconsumed <= 200) {
			totalamount = (100 * 1.20) + (unitconsumed - 100) * 2.20;
		} else if (unitconsumed <= 300) {
			totalamount = (100 * 1.20) + (100 * 2.20) + (unitconsumed - 200) * 3.20;
		} else {
			totalamount = (100 * 1.20) + (100 * 2.20) + (100 * 3.20) + (unitconsumed - 300) * 4.00;
		}

		System.out.println(totalamount);

	}

	void display() {
		System.out.println("Elecricity connection is the name of " + name);
		System.out.println("Your consumer number is :" + consumerno);
		System.out.println("You have consume " + unitconsumed + " units");
		System.out.println("Your totalbill is :" + totalamount);
	}

	public static void main(String[] args) {
		ElectricityBil bill = new ElectricityBil();
		bill.setInfo("Prakhar", 34567838, 90);
		bill.calculateAmount();
		bill.display();
	}

}
