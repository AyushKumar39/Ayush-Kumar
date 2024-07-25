package string;

import java.util.Scanner;

public class ReverseString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x=sc.nextLine();
        String reversedString="";
        for(int i=x.length()-1;i>=0;i--){
            reversedString=reversedString+x.charAt(i);
        }
        System.out.println("Reversed String is : " +reversedString);
    }
}
