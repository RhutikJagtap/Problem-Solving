package array;

//count the number of triplets whose sum is equal to the given targetSum
public class CountTripletsWhoseSum {
	
	static int countTriplets(int[] arr,int targetSum)
	{
		int count=0;
		
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[i]+arr[j]+arr[k]==targetSum) {
						count++;
					}
					
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,4,5,6,3};
		
		int targetSum=12;
		
		int count = countTriplets(arr,targetSum);
		System.out.println("Triplets count = "+count);
	}

}
