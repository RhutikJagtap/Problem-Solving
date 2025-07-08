package pattern_programs;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();

		int row = 1;

		while (row <= n) {
			int spaces = 1;
			while (spaces <= (2 * row) - 2) {
				System.out.print("  ");
				spaces++;
			}

			int column = 1;
			while (column <= n - row + 1) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();

		}
	}

}

//
//1  <=  0  2*1-2
//2  <=  2  2*2-2
//3  <=  4  2*3-2
//4  <=  6  2*4-2
//5  <=  8  2*5-2
