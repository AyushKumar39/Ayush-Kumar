package Array2D;

import java.util.Scanner;

public class UpperTriangularMatrix {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row : ");
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
        System.out.println("Original Array is : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

        int rows=a.length;
        int cols=a[0].length;
        if(cols!=rows){
            System.out.println("Matrix should be a Square Matrix : ");
        }else{
            System.out.println("Upeer Triangular Matrix : ");
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(j<i)
                        System.out.print("0 ");
                    else
                        System.out.print(a[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
}
