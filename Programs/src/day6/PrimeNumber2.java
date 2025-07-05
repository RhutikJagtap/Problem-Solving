package day6;

import java.util.Scanner;

public class PrimeNumber2 {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if (n%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a  Number");
		int n = scanner.nextInt();
		
		boolean result = isPrime(n);
		
		if (result) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
	}

}
