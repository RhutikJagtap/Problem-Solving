package array;

public class SwapArrayElements {
	
	static void swap(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;			
		}
	}
	
	static void display(int[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr= {10,20,5,7,8};
		
		System.out.println("Before Swapping array elements");
		display(arr);
		
		swap(arr);
		
		System.out.println("After Swapping array elements");
		display(arr);
		
	}

}
