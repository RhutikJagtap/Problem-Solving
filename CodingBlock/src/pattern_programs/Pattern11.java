package pattern_programs;

import java.util.Scanner;

public class Pattern11 {

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
			while (column <= row) {
				System.out.print("* " + " ");
				column++;
			}
			row++;
			System.out.println();
		}

	}

}

//row    star
//1    		1
//2    		2
//3    		3
//4    		4
//5    		5