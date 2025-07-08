package day1;

import java.util.Scanner;

public class EndToMid {
	
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
		
		System.out.println("Array Elements from end to mid");
		for(int i=arr.length-1;i>=arr.length/2;i--)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
