package day2;

import java.util.Scanner;

public class ArrayProduct {
	
	static long product(int[] arr)
	{
		long product=1;
		
		for(int i=0;i<arr.length;i++)
		{
			product=product*arr[i];
		}
		
		return product;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter th array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		
		long result = product(arr);
		System.out.println(result);
	}

}
