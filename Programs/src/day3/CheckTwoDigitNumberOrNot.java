package day3;

import java.util.Scanner;

public class CheckTwoDigitNumberOrNot {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n=scanner.nextInt();
		
		if (n>=10 && n<=99) {
			System.out.println("Yes Two digit Number");
		}else {
			System.out.println("No");
		}
	}

}
