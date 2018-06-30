package BootcampProblems.assignment1_arrays;

//What if the array has 0’s, 1’s and 2’s? Find another solution, which scans the
//array once.

public class Q9 {
	public static void sortarray(int[] arr )
	{
		int left=0,right = arr.length-1;
		int right0 = arr.length-1;
		while (left < right0)
	    {
	        while (arr[left] == 0 && left < right0)
	        {
	            left++; 			

	        }
	        while (arr[right0] != 0  && left < right0)
	        {    
	        	right0--;		
	        }

	 
	        
	        if (left < right0 )
	        {
	        	int temp = arr[left];
	            arr[left] = arr[right0];
	            arr[right0] = temp;
	            left++;
	            right0--;
	     
	        }
	       
	    
	    }
 
		while(left < right)
		{
			 	while (arr[left] == 1  && left < right)  
			 	{
			 		left++;

		        }
		        while (arr[right] == 2 && left < right)
		        {
		        	right--;

		        }
		        if (arr[left] > arr[right] )
		        {
		        	int temp = arr[left];
		            arr[left] = arr[right];
		            arr[right] = temp;
		            left++;
		            right--;
		        }	
		}

		
		//			int lo = 0;
		//	        int hi = a.length - 1;
		//	        int mid = 0,temp=0;
		//	        while (mid <= hi)
		//	        {
		//	            switch (a[mid])
		//	            {
		//	            case 0:
		//	            {
		//	                temp   =  a[lo];
		//	                a[lo]  = a[mid];
		//	                a[mid] = temp;
		//	                lo++;
		//	                mid++;
		//	                break;
		//	            }
		//	            case 1:
		//	                mid++;
		//	                break;
		//	            case 2:
		//	            {
		//	                temp = a[mid];
		//	                a[mid] = a[hi];
		//	                a[hi] = temp;
		//	                hi--;
		//	                break;
		//	            }
		//	            }
//	        }
		

	}
	
	public static void main(String[] args) {
		int arr[] = {0,2,1,0,0,0,2,0,1,0,1,1,1,2,2,0,0,1,0,2};
		
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		sortarray(arr);
		for(int i = 0 ; i < arr.length ; i++)
			System.out.print(arr[i] + " ");
		
	}
}
