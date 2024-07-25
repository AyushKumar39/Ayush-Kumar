package Array;

import java.util.Scanner;

public class DuplicateElement {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size :");
        int x=sc.nextInt();
        int a[]=new int[x];
        for(int i=0;i<x;i++){
            System.out.print("Enter the element : ");
            a[i]=sc.nextInt();
        }
        for(int j=0;j<a.length;j++){
            for(int k=j+1;k<a.length;k++){
                if(a[j]==a[k]){
                    System.out.println("Duplicate Element is : " +a[j]);
                }
            }

        }
    }
}
