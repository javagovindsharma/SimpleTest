package BootcampProblems.assignment2_strings;

//Given two arrays, find maximum sum path passing through their intersection. 

public class Q7 {

	public static int max_sum(int[] arr1,int[] arr2)
	{
		int result = 0, sum1 = 0, sum2 = 0;
		int i = 0, j = 0;
		
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] < arr2[j])
			{
				sum1 += arr1[i++];
			}
			else if(arr1[i] > arr2[j])
				sum2 += arr2[j++];
			else  // we reached a common point
	        {
	            // Take the maximum of two sums and add to result
	            result += (sum1 > sum2)? sum1 : sum2;
	 
	            // Update sum1 and sum2 for elements after this
	            // intersection point
	            sum1 = 0; sum2 = 0;
	           
	 
	            // Keep updating result while there are more common
	            // elements
	            while (i < arr1.length &&  j < arr2.length && arr1[i] == arr2[j])
	            {
	                result = result + arr1[i++];
	                j++;
	            }
	        }
		}
		// Add remaining elements of ar1[]
	    while (i < arr1.length)
	        sum1  +=  arr1[i++];
	 
	    // Add remaining elements of ar2[]
	    while (j < arr2.length)
	        sum2 +=  arr2[j++];
	 
	    // Add maximum of two sums of remaining elements
	    result +=  (sum1 > sum2)? sum1 : sum2;
	 
	    return result;
			
			
		}
		
		
		
	
	
	public static void main(String[] args) {
		int[] arr1 = {2, 3, 7, 10, 12};
		int[] arr2 = {1, 5, 7, 8};
		System.out.println(max_sum(arr1, arr2));
	}

}
