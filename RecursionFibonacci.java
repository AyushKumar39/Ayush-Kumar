package Number;

import java.util.Scanner;

public class RecursionFibonacci {
    static int a=0,b=1;
     static void printFibonacci(int d){
        if(d>0){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            printFibonacci(d-1);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int d=sc.nextInt();
        System.out.print(a +" " +b);
        printFibonacci(d-2);
    }
}
