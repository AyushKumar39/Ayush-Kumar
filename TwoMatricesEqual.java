package Array2D;

import java.util.Scanner;

public class TwoMatricesEqual {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row=sc.nextInt();
        System.out.print("Enter the column : ");
        int column =sc.nextInt();


        int a[][]=new int[row][column];
        System.out.println();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter the Element : ");
                 a[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("1st 2D Array is : ");
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
        System.out.println("2nd 2D Array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print( b[i][j] +" ");
            }
            System.out.println();
        }
         int row1=a.length;
         int col1=a[0].length;
         int row2=a.length;
         int col2=a[0].length;
         boolean flag=true;
         if(row1 !=row2 || col1 !=col2){
             System.out.println("Matrices are Equal.");
         }
         else {
             for (int i = 0; i < row1; i++) {
                 for (int j = 0; j < col1; j++) {
                     if (a[i][j] != b[i][j]) {
                         flag = false;
                         break;
                     }
                 }
             }
             if (flag) System.out.println("Matrices are Equal.");
                else System.out.println("Matrices are not Equal.");
         }
    }
}
