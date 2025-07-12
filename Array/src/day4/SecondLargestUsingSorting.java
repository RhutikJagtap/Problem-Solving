package day4;

import java.util.Scanner;

public class SecondLargestUsingSorting {
	
	static int secondLargest(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		return arr[arr.length-2];
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		int result = secondLargest(arr);
		System.out.println("Second Largest "+result);
	}

}
