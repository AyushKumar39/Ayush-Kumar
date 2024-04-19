import java.lang.*;
import java.util.*;

class Array{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int a=sc.nextInt();
        int x[]=new int[a];

        for(int i=0;i<a;i++) {
            x[i]=sc.nextInt();
           // System.out.println("enter the element of array :" +z);
        }
        for(int i=0;i<x.length;i++){
           System.out.println("enter the element of the array :" +x[i]);
        }
    }
}