package string;

import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Character : ");
        String x=sc.nextLine();
        System.out.println();
        System.out.print("Original String is : " +x);
        System.out.println();

        boolean flag=true;
        x=x.toLowerCase();
        for(int i=0;i<x.length()/2;i++){
            if(x.charAt(i) !=x.charAt(x.length()-i-1)){
                flag =false;
                break;
            }
        }
        if(flag)
            System.out.println("Given String is palindrome. ");
        else System.out.println("Given String is not a Palindrome.");
    }
}
