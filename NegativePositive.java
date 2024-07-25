package Number;

import java.util.Scanner;

public class NegativePositive {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        if(x>0)
            System.out.print("positive Number ");
            else if(x<0) System.out.print("Negative Number ");
            else System.out.print("number is zero");
    }
}
