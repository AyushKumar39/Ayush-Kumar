package Number;

import java.util.Scanner;

public class Sum {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("A= ");
         int a= sc.nextInt();
        System.out.print("B= ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Total =" +c);
    }
}
