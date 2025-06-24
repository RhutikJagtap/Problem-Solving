package day5;

import java.util.Scanner;

public class PrimeNumberBruteForce {
	
	static boolean isPrime(int n)
	{
		if (n==1) {
			return true;
		}
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if (n%i==0) {
				count++;
			}
		}
		
		if (count==2) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		
		boolean result = isPrime(n);
		
		if (result) {
			System.out.println(n+" is a Prime Number");
		}else {
			System.out.println(n+" is a Not Prime Number");
		}
	}

}
