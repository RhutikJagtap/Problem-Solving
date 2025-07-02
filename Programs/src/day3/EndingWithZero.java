package day3;

import java.util.Scanner;

//check number is ending with 0
public class EndingWithZero {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		if (n%10==0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}

}
