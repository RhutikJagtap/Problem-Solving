package day8;

import java.util.Scanner;

public class DigitCount {
	
	static int countDigits(int n)
	{
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = scanner.nextInt();
		
		int count = countDigits(n);
		System.out.println("Total Digits ="+count);
	}

}
