package day7;

import java.util.Scanner;

public class DecimalToBinary {
	static String decimalToBinary(int n)
	{
		String b="";
		
		while(n>=1)
		{
			int rem=n%2;
			b=rem+b;
			n=n/2;			
		}
		return b;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number");
		int n = scanner.nextInt();
		
		String result = decimalToBinary(n);
		System.out.println("Binary ="+result);
	}

}
