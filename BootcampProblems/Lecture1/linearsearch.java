package Lecture1;

import java.util.Scanner;


public class linearsearch {

    public static int lsearch(int[] arr, int key){
        for( int i= 0 ; i < arr.length ; i++){
            if(arr[i] == key)
                return arr[i];
        }
        return -1;
    }
    public static void addelements(int[] arr){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length ; i++)
            arr[i]= s.nextInt();
        s.close();
    }

    public static void main(String[] args) {

        int[] a = new int[5];
        int key;
        Scanner s = new Scanner(System.in);
        System.out.println("Add elements to array");

        addelements(a);
        System.out.println("EnterElementtosearch");
        key = s.nextInt();

        if(lsearch(a,key)!=-1)
            System.out.print("Element found;");
        else
            System.out.println("Element not found");
        s.close();
    }
}

