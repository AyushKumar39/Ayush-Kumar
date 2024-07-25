package string;

import java.util.Scanner;

public class SubsetsString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x=sc.nextLine();
        System.out.println();
        System.out.print(x +" ");
        System.out.println();

        int length=x.length();
        int temp=0;
        String a[]=new String[length*(length+1)/2];
        for(int i=0;i<length;i++){
            for(int j=i;j<length;j++){
                a[temp]=x.substring(i,j+1);
                temp++;
            }
        }
        System.out.println();
        System.out.print("All Subsets for given String are :- ");
        System.out.println();
        for(int i=0;i<a.length;i++){
            System.out.println(a[i] +" ");
        }
    }
}
