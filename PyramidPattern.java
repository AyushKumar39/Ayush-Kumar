package Number;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number :");
        int a= sc.nextInt();
        for(int i=0;i<a;i++){
            for(int j=a-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
