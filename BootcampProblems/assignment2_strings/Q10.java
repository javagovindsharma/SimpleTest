package BootcampProblems.assignment2_strings;

//Rotate a 2D matrix by 90 degrees clockwise 
//E.g ­ Consider Array  
//1    2    3
//4    5    6 
//7    8    9 
// After rotating 90 degrees clockwise it will be ­  
//7    4    1 
//8    5    2 
//9    6    3 



public class Q10 {
	
	public static void rotatematric(int[][] mat)
	{
		int top = 0;
		int bottom = mat.length-1;
		int left = 0;
		int right = mat[0].length-1;

		while (left < right && top < bottom)
		{
			int prev = mat[top+1][left];
//			# Move elements of top row one step right
			for(int i = left; i < right+1 ; i++)
			{
				int curr = mat[top][i];
				mat[top][i] = prev;
				prev = curr;
				top += 1;
			}
			
//			# Move elements of rightmost column one step downwards
			for(int i = top ; i < bottom+1 ; i++)
			{
				int curr = mat[i][right];
				mat[i][right] = prev;
				prev = curr;
				right -= 1	;
			}
//			# Move elements of bottom row one step left
			for (int i = right; i < left-1; i--)
			{
				int curr = mat[bottom][i];
				mat[bottom][i] = prev;
				prev = curr;
				bottom -= 1;
			}
//			# Move elements of leftmost column one step upwards
			for (int i =bottom; i< top-1; i--)
			{
				int curr = mat[i][left];
				mat[i][left] = prev;
				prev = curr;
				left += 1;
		
			}
		}

					

		for(int i = 0 ; i < mat.length ; i++ )
		{
			for(int j = 0 ; j < mat[0].length ; j++)
			{
				System.out.print(mat[i][j]+ " ");
			}
		System.out.println();
		}				

											
	}

	
	
	public static void rotate(int[][] arr) {
		int row = arr.length;
		int col = arr[0].length;
		
		int[][] rot_arr = new int[col][row];
		
		for(int i = 0 ; i < row ; i++ )
		{
			for(int j = 0 ; j < col ; j++)
			{
				rot_arr[j][(rot_arr[0].length-1)-i] = arr[i][j];
			}
		}
		
		for(int i = 0 ; i < row ; i++ )
		{
			for(int j = 0 ; j < col ; j++)
			{
				System.out.print(rot_arr[i][j]+ " ");
			}
		System.out.println();
		}
	}
	public static void main(String[] args) {
		int[][] arr ={{1,2,3},{4,5,6},{7,8,9}};
		rotate(arr);
//		rotatematric(arr);
	}

}
