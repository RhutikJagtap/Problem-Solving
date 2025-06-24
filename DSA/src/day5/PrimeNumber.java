package day5;

import java.util.Scanner;

public class PrimeNumber {
	
	static boolean isPrime(int n)
	{
		for(int i=2; i<=n/2;i++)
		{
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		int n = scanner.nextInt();
		
		boolean result = isPrime(n);
		
		if (result) {
			System.out.println(n+" is a Prime Number");
		}else {
			System.out.println(n+" is Not Prime Number");
		}
	}
}
