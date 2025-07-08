package pattern_programs;

import java.util.Scanner;

//square pattern
public class Pattern2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		
		int row=1;
		
		while (row<=n) {
			int column=1;
			while (column<=n) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
		}
	}
}
