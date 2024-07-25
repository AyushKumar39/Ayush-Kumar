package Array;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            a[i]=sc.nextInt();
        }
        System.out.print("Original Array is : ");
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]  +" ");
        }
        int rotated =a[3];
        for(int k=0;k<rotated;k++){
            int last;
            last=a[a.length-1];
            for(int l=a.length-1;l>0;l--){
                a[l]=a[l-1];
            }
            a[0]=last;
        }
        System.out.println();
        System.out.print("Rotated Array is : ");
        for(int k=0;k<a.length;k++){
            System.out.print(a[k] +" ");
        }
    }
}
