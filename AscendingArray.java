package Array;

import java.util.Scanner;

public class AscendingArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the Element : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Original Array is : " );
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] +" ");
        }
        int temp=0;
        for(int j=0;j<a.length;j++){
            for(int z=j+1;z<a.length;z++){
            if(a[j]>a[z]) {
                 temp=a[j];
                a[j]=a[z];
                a[z]=temp;
              }
            }
        }
        System.out.println();
        System.out.print("Array Sorted in Ascending Array is : ");
        for (int j=0;j<a.length;j++){
            System.out.print(a[j] +" " );
        }
    }
}
