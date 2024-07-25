package Number;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int b=0;
        while(x !=0){
            int a=x%10;
             b=b*10+a;
             x=x/10;
        }
        System.out.print("Reversed Number :" +b);
    }
}
