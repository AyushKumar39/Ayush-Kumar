package Array;

import java.util.Scanner;

public class Array2D {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Rows : ");
        int rows=sc.nextInt();
        System.out.print("Enter the columns : ");
        int columns=sc.nextInt();

        int a[][]=new int[rows][columns];
         for(int i=0;i<rows;i++){
             for(int j=0;j<columns;j++){
                 System.out.print("Enter element at position : ");
                 a[i][j]=sc.nextInt();
             }
        }
        System.out.println("2D Array is : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(a[i][j]  +" ");
            }
            System.out.println();
        }
    }
}
