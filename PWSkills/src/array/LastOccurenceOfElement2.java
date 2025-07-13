package array;

//approach 2
public class LastOccurenceOfElement2 {
	static int lastOccurence(int[] arr,int k)
	{
		int lastIndex=-1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==k) {
				lastIndex=i;
			}
		}
			
		return lastIndex;
	}
	
	public static void main(String[] args) {
		int[] arr= {5,6,5,3,5,4};
		
		int k=5;
		
		int index = lastOccurence(arr,k);
		System.out.println("Last Occurence at index = "+index);
		
	}
}

