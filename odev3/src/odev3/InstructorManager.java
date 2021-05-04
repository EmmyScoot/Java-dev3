package odev3;

public class InstructorManager {
	public void addCourse(String coursename) {


		System.out.println(coursename + " kursu baþarýyla eklendi");
	}
    public void delCourse(String delCourse) {
    	System.out.println(delCourse + "kurs baþarýyla silindi");
    	
    }
	public void addInstructor(Instructor user) {
		System.out.println(user.name +" "+ user.lastname + " baþarýyla kaydoldu");
		
	}
}
