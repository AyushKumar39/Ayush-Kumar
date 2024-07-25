package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String x=sc.nextLine();
        System.out.print("Enter the  2nd Sentence : ");
        String y=sc.nextLine();
            System.out.print(x +" ");
            System.out.print( y +" ");

        System.out.println();

            char[]a=x.toCharArray();
            char[]b=x.toCharArray();

            if(Arrays.equals(a,b)==true){
                System.out.print("Both the Sentence is Anagram. ");
            }else{
                System.out.print("Both sentence is not a Anagram.");
            }
    }
}
