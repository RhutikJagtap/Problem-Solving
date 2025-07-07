package day8;

import java.util.Scanner;

public class CountEvenDigits {
	
	static int evenDigitCount(int n)
	{
		int count=0;
		
		while(n>0)
		{
			int lastDigit=n%10;
			
			if (lastDigit%2==0) {
				count++;
			}
			n=n/10;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		int result = evenDigitCount(n);
		System.out.println(result);
	}

}
