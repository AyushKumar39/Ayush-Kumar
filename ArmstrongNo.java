package Number;

import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        if(IsArmstrong(x))
            System.out.print("Armstrong number ");
        else{
            System.out.print("Not Armstrong");
        }
    }

    public static boolean IsArmstrong(int n){
        int a=0,b=0,c=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
            a++;
        }
        temp=n;
        while(temp>0){
            b=temp%10;
            c +=(Math.pow(b,a));
            temp=temp/10;
        }
        if(n==c)
            return  true;
        else {
            return false;
        }
    }
}
