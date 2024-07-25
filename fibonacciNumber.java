package Number;

import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[]args){
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number :");
                int d=sc.nextInt();
                int a=0,b=1;
                System.out.print(a +" " +b +" ");
                for(int i=2;i<d;++i){
                int  c=a+b;
                 System.out.print(" "+c);
                        a=b;
                        b=c;
        }
    }
//-------------------------------  OTHER METHOD ---------------------------------------------

}
