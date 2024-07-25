package string;

import java.util.Scanner;

public class DivideNEqualsPart {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the sentence : ");
        String x=sc.nextLine();
        System.out.print(x +" ");

        System.out.println();
        int length=x.length();
        System.out.print("Enter the N : ");
        int n =sc.nextInt();

        int temp=0;
        int chars=length/n;
        String[] equalStr=new String[n];

        if(length %n !=0){
            System.out.print("Sorry this String Cannot be divided into." +n +" Equal parts .");
        }else{
            for(int i=0;i<length;i=i+chars){
               String part =x.substring(i,i+chars);
                equalStr[temp]=part;
                temp++;
            }
            System.out.print(n +" Equal parts of given String are : ");
            System.out.println();
            for(int i=0;i<equalStr.length;i++){
                System.out.println(equalStr[i]);
            }
        }
    }
}
