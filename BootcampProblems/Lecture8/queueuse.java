package BootcampProblems.Lecture8;

public class queueuse {

	public static void main(String[] args) {
		queuelinkedlist<Integer> queue = new queuelinkedlist<>();
		for(int i = 1 ; i <= 5 ; i++)
		{
			queue.enqueue(i);
		}
		System.out.println("size : " + queue.size);
		while(!queue.isEmpty())
		{
			System.out.println(queue.dequeue());
		}
	}
}
