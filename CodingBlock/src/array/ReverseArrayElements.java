package array;

public class ReverseArrayElements {
	
	static void reverse(int[] arr)
	{
		int start=0;
		int end=arr.length-1;
		
		while (start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
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
		int[] arr= {10,20,30,40,50,60};
		
		display(arr);
		
		reverse(arr);
		System.out.println("After Reversing the array");
		
		display(arr);
	}

}
