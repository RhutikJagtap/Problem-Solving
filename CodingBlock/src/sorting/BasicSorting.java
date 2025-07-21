package sorting;

public class BasicSorting {
	
	static void sortArray(int[] arr)
	{
		for (int j = 0; j < arr.length-1; j++) {
			//comparing adjacent array elements
			if (arr[j]>arr[j+1]) {
				//swap
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
	}
	
	static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
				
		System.out.println("Before Sorting Array");
		printArray(arr);
		
		System.out.println("After sorting array");
		sortArray(arr);
		printArray(arr);
		
		sortArray(arr);
		printArray(arr);
		
		sortArray(arr);
		printArray(arr);
		
		sortArray(arr);
		printArray(arr);
		
	}

}
