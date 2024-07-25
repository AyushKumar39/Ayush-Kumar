package Array;

import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        int size=a.length;
        for(int i=0;i<x;i++){
            System.out.print("Enter the Element : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Original Array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Second Smallest Number is : " +a[size-2]);
    }
}
