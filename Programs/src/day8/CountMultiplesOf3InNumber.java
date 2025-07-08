package day8;

import java.util.Scanner;

public class CountMultiplesOf3InNumber {
	static int countMultiplesOf3InNumber(int n)
	{
		int count=0;
		
		while(n>0)
		{
			int lastDigit=n%10;
			
			if (lastDigit%3==0) {
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
		
		int result = countMultiplesOf3InNumber(n);
		System.out.println(result);
	}

}
