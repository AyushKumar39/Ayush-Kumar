package Number;

import java.util.Scanner;

public class RecursionFactorial {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int fact=1;
        fact=factorial(x);
        System.out.print("factorial number :"+fact);
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
}
