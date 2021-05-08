package odev3;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.id = 1;
		student.name = "Emmy";
		student.lastname = "Scoot";
		student.number = 123;

		Instructor instructor = new Instructor();
		instructor.id = 1;
		instructor.name = "Engin";
		instructor.lastname = "Demiroğ";
		instructor.blog = "https://www.kodlama.io/courses/1332369/author_bio";

		InstructorManager instructorManager = new InstructorManager();

		instructorManager.addCourse("Java");
		instructorManager.delCourse("C#");
		instructorManager.addInstructor(instructor);

		UserManager userManager = new UserManager();

		userManager.addComment("Müq");
		userManager.addUser(student);

		StudentManager studentManager = new StudentManager();
		studentManager.odev("Java");

	}

}
