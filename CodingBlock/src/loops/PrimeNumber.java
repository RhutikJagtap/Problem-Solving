package loops;

import java.util.Scanner;

public class PrimeNumber {

	static String checkPrime(int n) {
		int count = 0;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count >= 1) {
			return "Not Prime";
		}

		return "Prime";
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a number");
		int n = scanner.nextInt();

		String result = checkPrime(n);
		System.out.println(result);
	}

}
