package day5;

import java.util.Scanner;

public class PrintPairsWhoseFirstValueIsSmaller {
	
	static void printPairs(int[] arr){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]<arr[j]) {
					System.out.println(arr[i]+" "+arr[j]);
				}
			}
		}
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
		
		System.out.println("Possible pairs ");
		printPairs(arr);
	}

}
