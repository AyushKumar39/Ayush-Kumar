package Array;

import java.util.Scanner;

public class MaximumValues {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
         int a[]=new int[x];
            int max=a[0];
        for(int i=0; i<x;i++){
            System.out.print("enter the element : ");
            a[i]=sc.nextInt();
        }
            for (int i=0;i<a.length;i++){
                if(a[i]>max)
                    max=a[i];
            }
        System.out.print("highest number is :" +max);
    }
}

