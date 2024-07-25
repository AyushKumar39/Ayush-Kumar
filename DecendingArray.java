package Array;

import java.util.Scanner;

public class DecendingArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for (int i=0; i<x;i++){
            System.out.print("Enter the Element : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Original Array is : ");
        for(int j=0;j<a.length;j++){
            System.out.print(a[j] +" ");
        }
        for(int z=0;z<a.length;z++){
            for(x=z+1;x<a.length;x++){
                if(a[z]<a[x]){
                    int temp=a[z];
                     a[z]=a[x];
                     a[x]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Sorted Array in Descending Array is : ");
        for(int z=0;z<a.length;z++){
            System.out.print(a[z] +" ");
        }
    }
}
