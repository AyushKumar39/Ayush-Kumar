package Number;

import java.util.Scanner;

public class Factor {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int x=sc.nextInt();
        System.out.println("Factor of " +x +" is :");
        for(int i=1;i<=x;i++){
            if(x%i==0){
                System.out.print(+i +" ");
            }
        }
    }
}
