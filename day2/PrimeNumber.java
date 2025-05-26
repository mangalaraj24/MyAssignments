package homeassignment.day2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		
		int count=0;
		
		for(int i=2;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==1) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a PrimeNumber");
		}

	}

}
