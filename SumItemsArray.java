package Array;

import java.util.Scanner;

public class SumItemsArray {
    public static void  main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            a[i]=sc.nextInt();
        }
        int sum=0;
        for(int j=0;j<a.length;j++){
            sum=sum+a[j];
        }
        System.out.print("Number.Sum is : " +sum);
    }
}
