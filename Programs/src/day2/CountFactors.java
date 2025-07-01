package day2;

import java.util.Scanner;

public class CountFactors {
	
	static int  countFactors(int n)
	{
		int count=0;
		
		for(int i=1;i<=n;i++)
		{
			if (n%i==0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		int result = countFactors(n);
		System.out.println("Factors Count= "+result);
	}

}
