package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualOrNot {
    public static void main(String []args){
        Scanner  sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
         for(int i=0;i<x;i++) {
             System.out.print("Enter the Element :");
             a[i] = sc.nextInt();
         }
         for(int j=0;j<x;j++){
             System.out.print("Enter the 2nd Element :");
             b[j]=sc.nextInt();
        }
         boolean result = Arrays.equals(a,b);
         if (result == true){
             System.out.print("Array are same :");
         }else{
             System.out.print("Array are not same : ");
         }
    }
}
