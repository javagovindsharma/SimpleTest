package Lecture2;

public class Array_2dprintwave {
	
	public static int[][] inputarray(){
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		return arr;
	}
	public static void printarray(int[][] arr) {
		for(int i = 0; i < arr[0].length ; i++)
		{
			for(int j = 0 ; j < arr.length ; j++ )
			{
				System.out.print(arr[j][i] + " ");
			}
			i++;
			for( int j = arr.length -1 ; j >=0 ; j-- )
			{
				System.out.print(arr[j][i]+ " ");

			}
		}
			
	}
	public static void main(String[] args) {
		printarray(inputarray());
	}
}
