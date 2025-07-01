package day2;

import java.util.Scanner;

public class FactorsOfNumber {
	
	static void printFactors(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if (n%i==0) {
				System.out.print(i+" ");
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n=scanner.nextInt();
		
		printFactors(n);
	}

}
