package Number;

import java.util.Scanner;

public class Albhabetic {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Alphabet :");
        char x=sc.next().charAt(0);
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u'){
            System.out.print(x +" is Vowel");
        }else{
            System.out.print(x +" is Constant");
        }
    }
}
