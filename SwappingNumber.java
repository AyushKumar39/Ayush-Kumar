package Number;

import java.util.Scanner;

public class SwappingNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number A :");
        int x=sc.nextInt();
        System.out.print("Enter the number B :");
        int y=sc.nextInt();
        x=x*y;
        y=x/y;
        x=x/y;
        System.out.print("Swap numbers : " +x +" " +y +" ");
    }
}
