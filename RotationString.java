package string;

import java.util.Scanner;

public class RotationString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st String : ");
        String x=sc.nextLine();
        System.out.print("Enter the 2nd String : ");
        String y=sc.nextLine();
        System.out.println();

        if(x.length() !=y.length()){
            System.out.println("Second String is not a rotation of first rotation. ");
        }
        else{
            x=x.concat(x);
        }
        if(x.indexOf(y)!=-1){
            System.out.println("Second String is a rotation of first String.");
        }else{
            System.out.println("Second String is not a rotation of first String");
        }
     }
}

