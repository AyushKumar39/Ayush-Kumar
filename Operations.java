package Number;

import java.util.Scanner;

public class Operations{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number= ");
        int a=sc.nextInt();
        System.out.print("Enter the number= ");
        int b=sc.nextInt();
        System.out.print("Enter the number= ");
        int c=sc.nextInt();
        int d=(a+b)%c;
        int e=-a+b*c;
        System.out.println("Total= "+e);
        System.out.println("Total 2= "+d);
    }
}
