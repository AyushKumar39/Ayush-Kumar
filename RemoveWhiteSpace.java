package string;

import java.util.Scanner;

public class RemoveWhiteSpace {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String x=sc.nextLine();
        System.out.println();

        x=x.replaceAll("\\s+","");
        System.out.println("String after removing all the white spaces : " +x);
    }
}
