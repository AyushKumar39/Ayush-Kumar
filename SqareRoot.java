package Number;

import java.util.Scanner;

public class SqareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int x = sc.nextInt();
        if(x<0)
        System.out.print("Negative Numbers");
        else{
            double result=squareRoot(x);
            System.out.print("Squate root : " +result );
        }
    }

    public static double squareRoot(int x) {
        if (x == 0 || x == 1)
            return x;
        int i=1,result=1;
        while(result<=x){
            i++;
            result=i*i;
        }
        return i-1;
    }
}