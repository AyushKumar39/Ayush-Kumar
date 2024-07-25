package string;

import java.util.Scanner;

public class ReplaceUpperCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String x=sc.nextLine();
        System.out.println();
        System.out.print("Original sentence is : " +x);
        System.out.println();
        StringBuffer sb=new StringBuffer(x);

        for(int i=0;i<x.length();i++){

            if(Character.isLowerCase(x.charAt(i))){
                sb.setCharAt(i,Character.toUpperCase(x.charAt(i)));
            }
            else if (Character.isUpperCase(x.charAt(i))) {
                sb.setCharAt(i,Character.toLowerCase(x.charAt(i)));
            }
        }
        System.out.print("String after Replace : " +sb);
    }
}
