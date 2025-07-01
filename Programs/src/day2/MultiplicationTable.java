package day2;

import java.util.Scanner;

public class MultiplicationTable {
	
	static void  printTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"x"+i+"="+ n*i);
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n = scanner.nextInt();
		
		printTable(n);
		
	}

}
