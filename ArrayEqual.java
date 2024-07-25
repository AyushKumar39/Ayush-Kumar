package Array;

import java.util.Scanner;

public class ArrayEqual {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size :");
        int x=sc.nextInt();
        int a[]=new int[x];
        int b[]=new int[x];
        for (int i=0;i<x;i++){
            System.out.print("Enter the 1st Array : ");
            a[i]=sc.nextInt();
        }
        System.out.println();
        for (int j=0;j<x;j++){
            System.out.print("Enter the 2nd Array : ");
            b[j]=sc.nextInt();
        }
        boolean result = true;
        if(a.length == b.length){
            for(int i=0;i<a.length;i=i+1){
              if(a[i] !=b[i]){
                  result =false;
              }
            }
        }
        else{
            result=false;
        }
        if(result==true){
            System.out.print("Array are Equal :");
        }
        else{
            System.out.print("Array are Not Equal :");
        }
    }
}
