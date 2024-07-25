package Number;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Gcd {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value :");
        int x=sc.nextInt();
        System.out.print("Enter the value :");
        int y=sc.nextInt();
        int temp,GCD=0;
        while(y!=0){
            temp=y;
            y=x%y;
            x=temp;
        }
        GCD =x;
        System.out.print("Greatest Common Factor of two number is :" +GCD);
    }
}
