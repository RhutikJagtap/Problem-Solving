package array;

public class MaxFromArray {
	
	static int findMax(int[] arr)
	{
		int max=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {54,-43,67,98,-4};
		
		int max = findMax(arr);
		System.out.println("Maximum from array = "+max);
		
	}

}
