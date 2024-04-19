import java.util.Scanner;
public class swapping {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("enter the value of b : ");
        int b=sc.nextInt();
//          int temp=a;
//          a=b;
//          b=temp;
        a=a+b;
        b=a-b;
        a=a-b;
         System.out.println("output of a : " +a);
         System.out.println("output of b : " +b);
    }
}
