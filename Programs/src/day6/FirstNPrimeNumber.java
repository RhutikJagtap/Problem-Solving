package day6;

import java.util.Scanner;

public class FirstNPrimeNumber {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	static void printPrime(int n)
	{
		int count=0;
		for(int i=2;count<n;i++)
		{
			if (isPrime(i)) {
				System.out.print(i+" ");
				count++;
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number that many prime numbers you have to print");
		int n = scanner.nextInt();
		
		printPrime(n);
	}

}
