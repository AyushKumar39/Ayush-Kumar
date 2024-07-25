package string;

import java.util.Scanner;

public class LongestReapting {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Sentence : ");
        String x=sc.nextLine();
        System.out.println();
        System.out.println("Sentence is : " +x +" ");
        int length=x.length();
        generatePermulation(x,0,length);
    }
    public static void generatePermulation(String x,int start,int end){
        if(start==end-1){
            System.out.println(x);
        }else{
            for(int i=start;i<end;i++){
                x=swapString(x,start,i);
                generatePermulation(x,start+1,end);
                x=swapString(x,start,i);
            }
        }
    }
    public static String swapString(String a,int i,int j){
        char[] b=a.toCharArray();
        char ch;
        ch=b[i];
        b[i]=b[j];
        b[j]=ch;
        return String.valueOf(b);
    }
}
