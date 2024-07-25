package Number;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int a=sc.nextInt();

        if(isPrime(a))
        System.out.print("prime number");
        else System.out.println("Not A prime");
    }
    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
