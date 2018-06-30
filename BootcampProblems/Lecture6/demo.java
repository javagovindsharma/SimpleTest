package Lecture6;


public class demo {

	
	public static<T> void sort(T[] t)
	{
		for(int i = 0 ; i < t.length - 1; i++)
		{
			for(int j = 1 ; j < t.length -i ; j++)
			{
				if(((Student) t[j-1]).compareTo((Student) t[j]) == 1)
				{
					T temp = t[j];
					t[j] = t[j-1];
					t[j-1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Student[] s = new Student[5];
		for(int i = 0 ; i < s.length ; i++ )
		{
			s[i] = new Student(15-i);
		}
		
		for(int i = 0 ; i< s.length ; i++)
			System.out.println(s[i].roll_no);
		
		
		
		

		sort(s);
		
		System.out.println("after sorting");
		for(int i = 0 ; i< s.length ; i++)
			System.out.println(s[i].roll_no);
		
	}


}
