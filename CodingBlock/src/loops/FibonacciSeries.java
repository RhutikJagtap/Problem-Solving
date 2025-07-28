package loops;

import java.util.Scanner;

public class FibonacciSeries {

	static void printFibonnacciSeries(int n) {
//		0 1 1 2 3 5 8 13 21 34......
		int a = 0;
		int b = 1;

		int i = 1;

		while (i <= n) {
			System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;
			//
			i++;
		}
		System.out.println(a);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the n");
		int n = scanner.nextInt();

		printFibonnacciSeries(n);
	}

}
