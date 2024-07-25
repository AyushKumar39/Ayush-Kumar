package Array;

import java.util.Scanner;

public class CopyElement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the Elelment : ");
            a[i]=sc.nextInt();
        }
        int b[]= new int[a.length];
        for(int j=0;j<a.length;j++){
            b[j]=a[j];
        }
        for (int j=0;j<a.length;j++){
            System.out.print(a[j] +" ");
        }
        System.out.println( );
        for (int k=0;k<b.length;k++){
            System.out.print(b[k] +" " );
        }
    }
}
