package day6;

import java.util.Scanner;

//print prime number between range
public class PrimeNumbersBetween {
	
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
	
	static void printPrime(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if (isPrime(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second number");
		int n2 = scanner.nextInt();
		
		printPrime(n1,n2);
	}

}
