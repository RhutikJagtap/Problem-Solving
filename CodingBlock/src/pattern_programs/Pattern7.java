package pattern_programs;

import java.util.Scanner;

//hollow square
public class Pattern7 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value of n");
		int n = scanner.nextInt();
		
		int row=1;
		while(row<=n)
		{
			int column=1;
			while (column<=n) {
				if (row==1 || row==n || column==1 || column==n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
				column++;
			}
			row++;
			System.out.println();
		}
	}

}
