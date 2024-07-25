package string;

import java.util.Scanner;

public class SwappingWords {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first  String : ");
        String x=sc.nextLine();
        System.out.print("Enter the Second String : ");
        String y=sc.nextLine();

        x=x+y;
        y=x.substring(0,(x.length()-y.length()));
        x=x.substring(y.length());
        System.out.println("Strings After Swapping :  " +x +" " +y);
    }
}
