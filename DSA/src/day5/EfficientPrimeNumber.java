package day5;

import java.util.Scanner;

public class EfficientPrimeNumber {
	
	static boolean isPrime(int n )
	{
		for(int i=2;i*i<=n;i++)
		{
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		
		boolean prime = isPrime(n);
		
		if (prime) {
			System.out.println(n+" is prime number");			
		}else {
			System.out.println(n+" is not prime number");
		}
	}

}
