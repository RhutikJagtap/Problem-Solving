package day7;

import java.util.Scanner;

public class PrintFirstNCommonMultiples {
	
	static void printFirstNCommonMultiples(int n1,int n2,int limit)
	{
		int count=0;
		for(int i=1;count<limit;i++)
		{
			if (i%n1==0 && i%n2==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a second Number");
		int n2 = scanner.nextInt();
		
		System.out.println("Enter a number that many common multiples you want ");
		int limit =scanner.nextInt();
		
		printFirstNCommonMultiples(n1,n2,limit);
		
	}

}
