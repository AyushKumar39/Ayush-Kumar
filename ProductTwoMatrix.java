package Array2D;

import java.util.Scanner;

public class ProductTwoMatrix {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row=sc.nextInt();
        System.out.print("Enter the Column : ");
        int column=sc.nextInt();
        int a[][]=new int[row][column];

        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter the Element : ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("1st Array of Matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print( a[i][j] +" ");
            }
            System.out.println();
        }

        int b[][]=new int[row][column];

        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter the Element : ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("2nd  Array of Matrix : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print( b[i][j] +" ");
            }
            System.out.println();
        }

        int row1=a.length;
        int row2=b.length;
        int col1=a[0].length;
        int col2=b[0].length;

        if(col1 !=row2){
            System.out.print("Matrix cannot be Multiplied. ");
        }
        else{
           int prod[][]=new int[row1][col2];
           for(int i=0;i<row1;i++){
               for(int j=0;j<col2;j++){
                   for(int k=0;k<row2;k++){
                       prod[i][j]=prod[i][j]+a[i][k]*b[k][j];
                   }
               }
           }
            System.out.println("product of two matrix : ");
           for(int i=0;i<row1;i++){
               for(int j=0;j<col2;j++){
                   System.out.print(prod[i][j] +" ");
               }
               System.out.println();
           }
        }
    }
}
