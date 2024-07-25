package Array;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];

        for(int i=0;i<x;i++){
            System.out.print("Enter the  Element : ");
             a[i]=sc.nextInt();
        }

        int max=a[0];
        for(int j=0;j<a.length;j++){
                 if(a[j]>max)
                     max=a[j];
            }
        System.out.println("Largest Number is : " +max);
        }
    }

