package day3;

import java.util.Scanner;

public class NumberEndsWith53 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		if (n%100==53) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
