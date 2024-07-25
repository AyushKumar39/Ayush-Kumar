package Array;

import java.util.Scanner;

public class OddEven {
    public static void  main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int x=sc.nextInt();
        int a[]=new int[x];
        for (int i=0;i<x;i++){
            System.out.print("Enter the Element : ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                System.out.println("Even Number "+a[i]);
            }
        }
        System.out.println();

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                System.out.println("Odd number " +a[i]);
            }
        }

    }
}
