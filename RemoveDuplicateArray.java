package Array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the Element ");
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);

        System.out.print("Original Array is : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();

        int temp[]=new int[a.length];
        int j=0;
        for(int i=0;i< a.length-1;i++){
            if(a[i] !=a[i+1]){
                temp[j++]=a[i];
            }
        }
        temp[j++]=a[a.length-1];
        System.out.println();
        System.out.print("After duplicated Array :");
        for(int k=0;k<j;k++){
            System.out.print(temp[k] +" ");
        }
    }
}



