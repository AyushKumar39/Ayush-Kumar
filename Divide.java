package Number;

import java.util.Scanner;

public class Divide {

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value A= ");
       int a= sc.nextInt();
        System.out.print("Enter value B= ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("divide= "+c);
    }
}
