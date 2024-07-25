package Array2D;

import java.util.Scanner;

public class Add {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row :  ");
        int row=sc.nextInt();
        System.out.print("Enter the column : ");
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
        System.out.println("1st 2D Array is : ");

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        int b[][]=new int[row][column];
        System.out.println();
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter the Element : ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("2nd 2D Array is :");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        int c[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of 2D Array is : ");
         for(int i=0;i<row;i++){
           for(int j=0;j<column;j++){
               System.out.print(c[i][j] +" ");
    }
             System.out.println();
       }
    }
}

