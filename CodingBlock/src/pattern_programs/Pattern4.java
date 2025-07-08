package pattern_programs;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int row=1;
		
		while (row<=n) {
			
			//spaces
			int spaces=1;
			while (spaces<=n-row) {
				System.out.print("  ");
				spaces++;
			}
			
			//column i.e star
			int column=1;
			while (column<=row) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
		}
	}

}
