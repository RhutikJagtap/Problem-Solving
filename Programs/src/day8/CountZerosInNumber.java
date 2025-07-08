package day8;

import java.util.Scanner;

public class CountZerosInNumber {
	
	static int countZeros(int n)
	{
		int count=0;
		
		while (n>0) {
			
			int lastDigit=n%10;
			
			if (lastDigit==0) {
				count++;
			}
			n=n/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		int count = countZeros(n);
		System.out.println(count);
	}

}
