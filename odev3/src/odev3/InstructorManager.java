package odev3;

public class InstructorManager {
	public void addCourse(String coursename) {


		System.out.println(coursename + " kursu ba�ar�yla eklendi");
	}
    public void delCourse(String delCourse) {
    	System.out.println(delCourse + "kurs ba�ar�yla silindi");
    	
    }
	public void addInstructor(Instructor user) {
		System.out.println(user.name +" "+ user.lastname + " ba�ar�yla kaydoldu");
		
	}
}
