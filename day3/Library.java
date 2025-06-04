package homeassignment.day3;

public class Library {

	// addBook method with String as return type
	public String addBook(String bookTitle) {
		return "Book Added Successfully: " + bookTitle;
	}

	// issueBook method without any return type
	public void issueBook() {
		System.out.println("Book Issued Successfully");
	}

	public static void main(String[] args) {
		// Object creation
		Library lib = new Library();
		// Calling addBook method by passing String as arguement and storing it in result
		String result = lib.addBook("The Harry Potter");
		System.out.println(result);
		//Calling issueBook method 
		lib.issueBook();

	}
}
