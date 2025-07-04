package day5;

import java.util.Scanner;

//without using third variable
public class SwapNumber2 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter second Number");
		int n2 = scanner.nextInt();
		
		n1=n1+n2; 
		n2=n1-n2;
		n1=n1-n2;
		
		System.out.println("first Number ="+n1);
		System.out.println("second Number ="+n2);
	}

}
