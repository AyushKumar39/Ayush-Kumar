package Number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
       // System.out.print(x +" ");
        for(int i=0;i<=x;i++){
            if (ISArmstrong(i))
                System.out.print(i +" ");
        }
    }
    public static boolean ISArmstrong(int n){
        int digits=0,last=0,sum=0;
        int temp=n;
        while(temp>0){
            temp=temp/10;
             digits++;
        }
        temp=n;
        while(temp>0){
            last=temp%10;
            sum+=(Math.pow(last,digits));
            temp=temp/10;
        }
        if(n==sum){
            return true;
        }else{
            return false;
        }
    }

}
