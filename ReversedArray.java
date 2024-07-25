package Array;

import java.util.Scanner;

public class ReversedArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the Element : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Reversed Array is : ");
        for(int j=a.length-1;j>=0;j--){
            //System.out.println("Reversed Array Element : "+a[j]);
            System.out.print(" " +a[j] +" ");
        }

    }
}
