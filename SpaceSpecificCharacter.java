package string;

import java.util.Scanner;

public class SpaceSpecificCharacter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String x=sc.nextLine();
        System.out.print("Original Sentence is :" +x);
        System.out.println();
        char ch='-';
        x=x.replace(' ',ch);
        System.out.println("String after replacing spaces with given character :- ");
        System.out.println(x);
    }
}
