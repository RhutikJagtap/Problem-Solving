package day6;

import java.util.Scanner;

public class DivisorsOfNumber2 {

	static void printDivisors(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i + "  " + n / i);
			}

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a  Number");
		int n = scanner.nextInt();

		printDivisors(n);
	}

}
