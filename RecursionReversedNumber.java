package Number;

import java.util.Scanner;

public class RecursionReversedNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        ReveredNumber(x);
    }
    public static void ReveredNumber(int number){
        if(number<10){
            System.out.print(number);
            return;
        }
        else{
            System.out.print(number%10);
            ReveredNumber(number/10);
        }
    }
}
