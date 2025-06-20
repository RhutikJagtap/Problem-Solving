package day1;

import java.util.Scanner;

//calculate the factorial using iterative approach
public class Factorial {
	
	static long fact(int n)
	{
		long result=1;
		
		for(int i=1;i<=n;i++)
		{
			result=result*i;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int n=scanner.nextInt();
		
		long result = fact(n);
		System.out.println("Factorial of "+n+ " is "+result);
	}

}
