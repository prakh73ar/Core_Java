package learning.oops;

public class BookFair {
	String bookname, authorName;
	float price;

	void setBookDetails(String booknm, String authornm, float pr) {
		bookname = booknm;
		authorName = authornm;
		price = pr;
	}

	void calculateDiscount() {
		float discount = 0.0f;
		if (price <= 100) {
			discount = price - (price * .02f);
		} else if (price > 1000 && price <= 3000) {
			discount = price - price * .10f;

		} else if (price > 3000) {
			discount = price - price * .15f;
		}
		System.out.println("Discount a price " + discount);
	}

	void display() {
		System.out.println("-----------------------Details_Of_Book----------------------");
		System.out.println("BookName " + bookname + " Author of Book " + authorName + " Price of Book " + price);
	}

	public static void main(String[] args) {
		BookFair book = new BookFair();

		book.setBookDetails("Motivation", "Prakhar", 15000);
		book.calculateDiscount();
		book.display();

	}
}
