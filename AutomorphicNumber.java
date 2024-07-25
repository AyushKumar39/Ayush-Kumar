package Number;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        int a=0;
        int c=x*x;
        int temp=x;
        while(temp >0){
            a++;
            temp=temp/10;
        }
        int lastDidits=(int)(c%(Math.pow(10,a)));
        if(x==lastDidits)
            System.out.print(x +" is an automorphic number");
        else System.out.print(x +"is not an automorphic number ");
    }
}
