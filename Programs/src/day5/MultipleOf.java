package day5;

import java.util.Scanner;

public class MultipleOf {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first Number");
		int n = scanner.nextInt();
		
		if (n%3==0 && n%5==0) {
			System.out.println("Java");
		}else if (n%3==0) {
			System.out.println("Python");
		}else if (n%5==0) {
			System.out.println("C");
		}
	}

}
