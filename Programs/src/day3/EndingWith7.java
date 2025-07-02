package day3;

import java.util.Scanner;

public class EndingWith7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		
		if (n%10==7) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
