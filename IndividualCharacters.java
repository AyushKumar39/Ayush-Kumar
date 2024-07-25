package string;

import java.util.Scanner;

public class IndividualCharacters {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Element : ");
        String x=sc.nextLine();
        for(int i=0;i<x.length();i++){
            System.out.print(x.charAt(i) +" ");
        }
    }
}
