package odev3;

public class UserManager {
	public void addComment(String comment) {
		System.out.println("'" + comment + "' yorum olarak kaydedildi");
		

	}

	public void addUser(User user) {
		System.out.println(user.name +" "+ user.lastname + " baþarýyla kaydoldu");
	}
}
