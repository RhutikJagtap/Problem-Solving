package day6;

import java.util.Scanner;

//check number is prime or not using count factor
public class PrimeNumberUsingCount {
	
	static boolean isPrime(int n)
	{
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
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		boolean result = isPrime(n);
		System.out.println(result);
		
	}

}
