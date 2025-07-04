package day5;

import java.util.Scanner;

//using third variable
public class SwapNumber1 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int n1 = scanner.nextInt();
		
		System.out.println("Enter first Number");
		int n2 = scanner.nextInt();
		
		int temp=n1;
		n1=n2;
		n2=temp;
		
		System.out.println("First Number ="+n1);
		System.out.println("second Number ="+n2);
	}

}
