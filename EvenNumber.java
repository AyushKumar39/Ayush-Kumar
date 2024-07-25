package Number;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number :");
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if(i%2==0){
                System.out.print(i +" ");
            }
        }
    }
}
