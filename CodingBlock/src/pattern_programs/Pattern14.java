package pattern_programs;

import java.util.Scanner;

//combination of two pattern
public class Pattern14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = scanner.nextInt();

		// first half of pattern
		int row = 1;
		while (row <= n) {

			int spaces = 1;
			while (spaces <= n - row) {
				System.out.print("  ");
				spaces++;
			}

			int column = 1;
			while (column <= row) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
		}

		// second half of pattern
		int second_pattern_row = 1;
		while (second_pattern_row < n) {
			int spaces = 1;
			while (spaces <= second_pattern_row) {
				System.out.print("  ");
				spaces++;
			}

			int column = 1;
			while (column <= n - second_pattern_row) {
				System.out.print("* ");
				column++;
			}
			second_pattern_row++;
			System.out.println();
		}

	}

}
