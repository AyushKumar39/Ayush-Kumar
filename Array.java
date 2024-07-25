package Array;

import java.util.Scanner;

public class Array {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int sz=sc.nextInt();
        int a[] =new int[sz];

         for(int i=0; i<sz;i++){
             System.out.print("enter the element : ");
            a[i]=sc.nextInt();
         }
         for(int i=0;i<a.length;i++){
             System.out.println("element of the array : " +a[i]);
         }
    }
}
