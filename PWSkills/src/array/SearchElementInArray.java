package array;

public class SearchElementInArray {
	
	static int search(int[] arr,int target)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,5,3};
		
		int target=3;
		
		int index = search(arr,target);
		
		if (index==-1) {
			System.out.println("Element Not Found");
		}else {
			System.out.println("Element found at index = "+index);
		}
	}

}
