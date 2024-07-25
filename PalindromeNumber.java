package Number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int a=sc.nextInt();

        int temp=a;
        int sum=0;

        while(a>0){
            int x=a%10;
             sum=(sum*10)+x;
            a=a/10;
        }
        System.out.print( +sum +" ");
        if(temp==sum){
            System.out.print(" palindrome number");
        }
        else{
            System.out.print("not a palindrome");
        }
    }
}
