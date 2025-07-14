package day6;

import java.util.Scanner;

public class OccurrenceOfEachElement {
	
	static void printElementCount(int[] arr)
	{
		int count=1;
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==arr[i+1]) {
				count++;
			}else {
				System.out.println(arr[i]+"-"+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+"-"+count);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size = scanner.nextInt();
		
		int[] arr=new int[size];
		
		System.out.println("Enter the array elements");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Occurence of each element");
		printElementCount(arr);
		
	}

}
