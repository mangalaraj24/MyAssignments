package homeassignment.day2;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter the Number:");
		int num = s.nextInt();

		int a = 0, b = 1;
		
		for (int i = 1; i <= num; i++) {
			System.out.println(a + " ");
			int sum = a + b;
			a = b;
			b = sum;
		}

	}

}
