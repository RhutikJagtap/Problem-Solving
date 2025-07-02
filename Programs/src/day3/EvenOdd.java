package day3;

import java.util.Scanner;

public class EvenOdd {
	
	static void checkEvenOrOdd(int n)
	{
		if (n%2==0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		checkEvenOrOdd(n);
	}

}
