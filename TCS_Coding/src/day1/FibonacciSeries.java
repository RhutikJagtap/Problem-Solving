package day1;

import java.util.Scanner;

//Given a positive integer N, print the Fibonacci series of N terms
//Sample Input 1
//5
//Sample Output 1
//0 1 1 2 3


//Sample Input 2
//10
//Sample Output 2
//0 1 1 2 3 5 8 13 21 34
public class FibonacciSeries {
	
	static void fibo(int n){
		
		int first_term=0;
		int second_term=1;
		
		int count=1;
		System.out.print(first_term+" ");
		while(count<n) {
			System.out.print(second_term+" ");
			second_term=first_term+second_term;
			first_term=second_term-first_term;
			count++;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		fibo(n);
		
	}

}
