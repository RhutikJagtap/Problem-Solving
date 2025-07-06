package day7;

import java.util.Scanner;

public class CommonDivisior {
	
	static void printCommonDivisiors(int n1,int n2)
	{
		int min=0;
		
		if (n1<n2) {
			min=n1;
		} else {
			min=n2;
		}
		
		for(int i=1;i<=min;i++)
		{
			if (n1%i==0 && n2%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a second number");
		int n2 = scanner.nextInt();
		
		printCommonDivisiors(n1,n2);
	}

}
