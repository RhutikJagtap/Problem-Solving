package day7;

import java.util.Scanner;

public class CommonDivisiorInReverse {
	
	static void printCommonDivisorsInReverse(int n1,int n2){
		int min=0;
		
		if (n1<n2) {
			min=n1;
		} else {
			min=n2;
		}
		
		for(int i=min;i>=1;i--)
		{
			if (n1%i==0 && n2%i==0) {
				System.out.print(i+" ");
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter a second Number");
		int n2 = scanner.nextInt();
		
		printCommonDivisorsInReverse(n1,n2);
	}

}
