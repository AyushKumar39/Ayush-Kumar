package string;

import java.util.Scanner;

public class TotalCharacter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x=sc.nextLine();
        int count=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i) !=' '){
              count++;
            }
        }
        System.out.print("Total Characters in String is : " +count);
    }
}
