package learning.oops;

class Movie {
	float rating;
	String movieName;

	void setDetails(float rating, String name) {
		this.rating = rating;
		movieName = name;
	}

	void display() {

		if (rating >= 0.0f && rating <= 2.0f) {
			System.out.println("This Movie is Flop");
		} else if (rating >= 2.10f && rating <= 3.4f) {
			System.out.println("Movie ia Semi-Hit");
		} else if (rating >= 3.5f && rating < 4.5f) {
			System.out.println("Movie is Hit");
		} else if (rating >= 4.5f && rating <= 5.0f) {
			System.out.println("Movie is Super Hit");
		}
		System.out.println("Movie name is :" + movieName);

	}

	public static void main(String[] args) {
		Movie mv = new Movie();
		mv.setDetails(4.9f, "Bahubali");
		mv.display();

	}

}