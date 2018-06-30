package BootcampProblems.assignment1_arrays;

public class Q1_pattern {
	
	public static void print_pattern(int n){
        int count = 1;
        for( int i = 0 ; i < 2*n -1 ; i++){
            for( int j = 0 ; j < Math.abs(n - 1 -i) ; j++)
                System.out.print("\t");
            for( int j = 0 ; j < 2 * (n - Math.abs(n - 1 - i )) - 1; j++ );
                System.out.print(count++ + "\t");
            System.out.println();
        }

    }

	public static void main(String[] args) {
		print_pattern(4);
//		
//        int n = 15;
//        int mid = (n/2) + 1;
//        for ( int row = 1 ; row <= mid ; row++){
//            for ( int col =  1 ; col <= mid ; col++)
//            {
//                if(col <=  mid - row + 1)
//                {
//                    System.out.print("*");
//                }
//                else
//                	System.out.print(" ");
//                
//            }
//            for (int col = mid +1 ; col <=n ; col++)
//            {
//                if(n - col + row > mid)
//                {
//                	System.out.print(" ");
//                }
//                else
//                	System.out.print("*");
//            }
//            System.out.println();
//        }
//        
//        for ( int row = mid+1 ; row <=n ; row++)
//        {
//        	int count = row - mid;
//        	for ( int col =  1 ; col <= mid ; col++)
//        	{
//        		while(count >= 0)
//        		{
//        			System.out.print("*");
//        			count--;
//        			col++;
//        			
//        		}
//        		if(count >= 0 || col <=mid)
//        			System.out.print(" ");
//
//        	}
//    		int count1 = (n - mid) -(row -mid) - 1;
//        	for ( int col = mid + 1 ; col <= n ; col++)
//        	{
//        		while(count1 > 0 )
//                {
//                	System.out.print(" ");
//                	count1--;
//                	col++;
//                }
//                System.out.print("*");
//        	}
//
//        	System.out.println();
//        }
        
        
	
	}
	
   
	

}
