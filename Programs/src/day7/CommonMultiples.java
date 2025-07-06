package day7;

import java.util.Scanner;

public class CommonMultiples {
	
	static void commonMultiples(int n1,int n2,int limit)
	{
		for(int i=1;i<=limit;i++)
		{
			if (i%n1==0 && i%n2==0) {
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
		
		System.out.println("Enter a number where you want to till print");
		int limit =scanner.nextInt();
		
		commonMultiples(n1,n2,limit);

	}
}
