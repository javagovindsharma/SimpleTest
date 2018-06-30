package Lecture3Recursion;


public class findanumber {
	public static int[] smallerarray(int[] a)
	{
		int smallerarray[] = new int[a.length-1];

		for(int i = 1 ; i < a.length ; i++)
		{
			smallerarray[i-1] = a[i];
		}
		return smallerarray;
	}
	public static int firstindex(int[] arr, int num)
	{
		if(arr.length == 0)
			return -1;
		if(arr[0] == num)
			return 0;
		int index = firstindex(smallerarray(arr), num);
		if(index != -1)
			index++;
		return index;
		
		
	}
	public static int lastindex(int[] a , int num)
	{
		if(a.length == 0)
			return -1;
		int numberinsorted = lastindex(smallerarray(a), num);
		if(numberinsorted !=-1 )
			return numberinsorted + 1;
		else 
		{
			if(a[0] == num)
				return 0;
			else
				return -1;
		}
		
	}
	
	public static void main(String[] args) 
	{
		int[] a = {1,2,7,3,4,7,5,6,8,7,9};
		System.out.println(firstindex(a, 7));
		System.out.println(lastindex(a, 7));
	}

}
