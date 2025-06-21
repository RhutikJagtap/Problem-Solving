package day2;

import java.util.Scanner;

public class CountDigit {
	
	public static int countDigits(int n) {
		int count=0;
		
		while (n>0) {
			n=n/10;
			count++;
		}
		return count;
	}

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number ");
		int n =scanner.nextInt();
		
		int count = countDigits(n);
		System.out.println("Total Number of digits "+count);
	}

	
}
