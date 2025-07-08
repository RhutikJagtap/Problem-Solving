package day1;

import java.util.Scanner;

public class OddIndexElement {
	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size=scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Odd index element");
		for(int i=0;i<arr.length;i++)
		{
			if (i%2!=0) {
				System.out.print(arr[i]+" ");				
			}
		}
	}
	

}
