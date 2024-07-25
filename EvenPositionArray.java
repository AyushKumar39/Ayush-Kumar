package Array;

import java.util.Scanner;

public class EvenPositionArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            a[i]=sc.nextInt();
        }
        for(int j=1;j<a.length;j=j+2){
            System.out.print(a[j] +" ");
        }
    }
}
