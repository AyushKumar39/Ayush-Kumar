package Number;

import java.util.Scanner;

public class SumNaturalNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int sum=0;
        for(int i=1;i<=x;++i){
            sum=sum+i;
        }
        System.out.print("sum of Number is " +sum);
    }
}
