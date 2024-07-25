package Number;

import java.util.Scanner;

public class TestData {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Input First Number= ");
        int a=sc.nextInt();
        System.out.print("Input Second Number= ");
        int b=sc.nextInt();
        System.out.print("sum= ");
        System.out.println(a+b);
        System.out.print("sub= ");
        System.out.println(a-b);
        System.out.print("multiply= ");
        System.out.println(a*b);
        System.out.print("Number.Divide= ");
        System.out.println(a/b);
        System.out.print("mod= ");
        System.out.println(a%b);
    }
}
