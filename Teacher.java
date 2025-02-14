package learning.oops;

class Teacher {
	String name;
	String collageName;
	String[] subjectName;

	void setTeacherDetals(String name, String collageName, String... subjects) {
		this.name = name;
		this.collageName = collageName;
		int nameOfSubject = subjects.length;

		subjectName = new String[nameOfSubject];

		for (int i = 0; i < subjects.length; i++) {
			subjectName[i] = subjects[i];

		}

	}

	void showDetails() {
		System.out.println("Teacher Nme is :" + name);
		System.out.println("Collage Name is :" + collageName);

		for (String sub : subjectName) {

			System.out.println(sub);
		}

	}

	public static void main(String[] args) {
		Teacher teach = new Teacher();
		Teacher tech = new Teacher();

		teach.setTeacherDetals("Dr. Swati ma'am", "Precussor", "Core Java", "Advance Java", "Mern Stack", "Bootstrap",
				"Python");
		teach.showDetails();

		tech.setTeacherDetals("Vandana Ma'am", "Goel Inst. Of Higher Studies Mahavidhyalaya", "Computer Fundamentalls",
				"DBMS", "Software Eng.");
		tech.showDetails();

	}
}