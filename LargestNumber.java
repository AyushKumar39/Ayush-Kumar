package Number;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number a :");
        int a=sc.nextInt();
        System.out.print("Enter the number b :");
        int b=sc.nextInt();
        System.out.print("Enter the number c :");
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.print("Greatest Number is :" +a);
        } else if (b>a && b>c) {
            System.out.print("Greatest Number is :" +b);
        } else if (c>a && c>b) {
            System.out.print("Greatest Number is :" +c);
        }else System.out.print("All number are same :");
    }
}
