package day2;

import java.util.Scanner;

public class SumOfTwoNumber {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter first Number");
			int n1=scanner.nextInt();
			
			System.out.println("Enter second Number");
			int n2=scanner.nextInt();
			
			int sum=n1+n2;
			
			System.out.println("Sum= "+sum);
		}
}
