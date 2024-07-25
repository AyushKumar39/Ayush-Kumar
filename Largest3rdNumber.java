package Array;

import java.util.Scanner;

public class Largest3rdNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
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
        for(int j=0;j<size;j++){
            for(int k=j+1;k<size;k++){
                if(a[j]>a[k]){
                    int temp=a[j];
                    a[j]=a[k];
                    a[k]=temp;
                }
            }
        }
        System.out.println();
        System.out.print("Largest Number is : " +a[size-3]);
    }
}
