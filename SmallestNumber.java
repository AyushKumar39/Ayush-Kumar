package Array;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            a[i]=sc.nextInt();
        }

        int min=a[0];
        for(int j=1;j<a.length;j++){
            if(a[j] < min)
                min=a[j];
        }
        System.out.print("The Smallest Number : " +min);
    }
}
