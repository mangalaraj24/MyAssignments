package homeassignment.day3;

public class LibraryManagement {

	public static void main(String[] args) {
		// Creating an object for Library Class in LibraryManagement class
		Library l = new Library();
		String result = l.addBook("The Chronicles");
		System.out.println(result);
		l.issueBook();
	}
}
