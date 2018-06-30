package Lecture6;

public class Student implements Comparable<Student>{
	
	public int roll_no;


	public Student(int roll_no2) {
		this.roll_no = roll_no2;
	}

	

	@Override
	public int compareTo(Student t) {
		// TODO Auto-generated method stub
		if(this.roll_no > t.roll_no)
			return 1;
		else if(this.roll_no < t.roll_no)
			return -1;
		return 0;
		
	}
	
}



