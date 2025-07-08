package pattern_programs;

import java.util.Scanner;

public class Pattern12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the value of n");
		int n = scanner.nextInt();

		int row = 1;

		while (row <= n) {
			int spaces = 1;
			while (spaces <= (n - row)) {
				System.out.print("  ");
				spaces++;
			}

			int column = 1;
			while (column <= (2 * row) - 1) {
				if (column % 2 == 0) {
					System.out.print("! ");
				} else {
					System.out.print("* ");
				}
				column++;
			}
			row++;
			System.out.println();
		}

	}

}
