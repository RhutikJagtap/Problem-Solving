package day4;

import java.util.Scanner;

public class PrintGreaterUsingTernaryOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a first Number");
		int n1 = scanner.nextInt();
		System.out.println("Enter a second Number");
		int n2 = scanner.nextInt();
		
		int res=n1>n2?n1:n2;
		
		System.out.println(res);

	}
}
