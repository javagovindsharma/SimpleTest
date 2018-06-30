package Lecture2;

public class Array_2d_spiral {
	
	public static int[][] inputarray(){
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		return arr;
	}
	public static void printarray(int[][] arr) {
		
		int max_elememts = 0;
//		for(int i  = 0 ; i < arr.length ;i++)
//		{
//			max_elememts += arr[i].length;
//		}
		max_elememts = arr.length * arr[0].length;
		int top = 0, bottom = arr.length, left = 0 , right = arr[0].length;		
		while(max_elememts > 0)
		{
			
			for(int i = left ; i <= right-1 && max_elememts !=0;i++ ){
				System.out.print(arr[top][i] +" ");
				max_elememts--;
				
				
			}
			top++;
			
			for(int i = top ; i < bottom && max_elememts !=0 ; i++){
				System.out.print(arr[i][right-1] +" ");
				max_elememts--;
				
			}
			right--;
			
			for(int i = right -1 ; i >= left  && max_elememts !=0 ;i-- ){
				System.out.print(arr[bottom-1][i] +" ");
				max_elememts--;
				
			}
			bottom--;
			
			for(int i = bottom - 1 ; i >= top && max_elememts !=0; i --){
				System.out.print(arr[i][left] +" ");
				max_elememts--;
				
			}
			left++;
			
		}
		
	}
	public static void main(String[] args) {
		printarray(inputarray());
	}

}
