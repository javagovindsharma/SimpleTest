package Lecture1;

import java.util.Scanner;


public class reversearray {

    public static void reverse_array(int[] arr)
    {

        int front = 0,temp;
        int rear = (arr.length)-1;

        while(front <= rear){
            temp = arr[front];
            arr[front] = arr[rear];
            arr[rear] = temp;
            front++;
            rear--;
        }

    }

    public static void addelements(int[] arr){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++)
            arr[i]= s.nextInt();
        s.close();
    }

    public static void printarray(int[] arr){
        for(int i =0; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }


    public static void main(String[] args){
        int[] a = new int[5];
        System.out.println("Add elements to array");
        addelements(a);
        printarray(a);
        reverse_array(a);
        System.out.println("");
        printarray(a);

    }
  
}
