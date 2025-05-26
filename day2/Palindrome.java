package homeassignment.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the word:");
		String str = s.next();

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		if (str.equalsIgnoreCase(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		// Using StringBuilder
		/*
		 * Scanner s = new Scanner(System.in); System.out.println("Enter the word:");
		 * String str1 = s.next();
		 * 
		 * StringBuilder sb = new StringBuilder(str1); StringBuilder rev = sb.reverse();
		 * 
		 * String str2 = rev.toString();
		 * 
		 * if (str1.equalsIgnoreCase(str2)) { System.out.println("Palindrome"); } else {
		 * System.out.println("Not a Palindrome"); }
		 * 
		 */

	}
}
