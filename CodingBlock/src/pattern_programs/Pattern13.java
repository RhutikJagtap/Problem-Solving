package pattern_programs;

import java.util.Scanner;

//combination of two patterns
public class Pattern13 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();
		
		//first half of row
		int row=1;
		while(row<=n)
		{
			int column=1;
			while (column<=row) {
				System.out.print("* ");
				column++;
			}
			row++;
			System.out.println();
		}
		
		//second half of pattern
		
		int second_pattern_row=1;
		while(second_pattern_row<n)
		{
			int column=1;
			while(column<=n-second_pattern_row)
			{
				System.out.print("* ");
				column++;
			}
			second_pattern_row++;
			System.out.println();
		}
	}

}
