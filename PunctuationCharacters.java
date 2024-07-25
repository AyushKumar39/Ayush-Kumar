package string;

import java.util.Scanner;

public class PunctuationCharacters {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String  x=sc.nextLine();
        int count = 0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)== ',' || x.charAt(i) == '.' || x.charAt(i) == '!'|| x.charAt(i) == '"')
                count++;
        }
        System.out.print("The number of punctuation is " +count);
    }
}
