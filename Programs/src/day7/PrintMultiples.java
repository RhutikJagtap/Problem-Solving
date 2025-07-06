package day7;

import java.util.Scanner;

public class PrintMultiples {
	
	static void printMultiples(int n,int limit)
	{
		for(int i=1;i<=limit;i++)
		{
			if (i%n==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = scanner.nextInt();
		
		System.out.println("Enter a number where you want to till print");
		int limit =scanner.nextInt();
		
		printMultiples(n,limit);
	}

}
