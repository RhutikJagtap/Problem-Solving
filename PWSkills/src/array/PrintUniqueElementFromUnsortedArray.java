package array;

public class PrintUniqueElementFromUnsortedArray {
	
	static int findUnique(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]==arr[j]) {
					arr[i]=-1;
					arr[j]=-1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]!=-1) {
				return arr[i];
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,2,1,3};
		
		int unique = findUnique(arr);
		System.out.println("Unique = "+unique);
	}

}
