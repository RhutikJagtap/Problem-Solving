package day4;

import java.util.Scanner;

public class AbsoluteValue {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int n = scanner.nextInt();
		
		if (n>=0) {
			System.out.println(n);
		} else {
			System.out.println(-n);
		}
	}

}
