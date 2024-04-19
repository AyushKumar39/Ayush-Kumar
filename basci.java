import java.util.Scanner;
public class basci {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("first number : ");
        a=sc.nextInt();
        System.out.print("Second number : ");
        b=sc.nextInt();
        System.out.println("sum of a and b : "+(a+b));
        System.out.println("subtract of a and b : "+(a-b));
        System.out.println("multiply of a and b : "+(a*b));
        System.out.println("divide of a and b : " +(a/b));
        System.out.println("mod of a and b : " +(a%b));
    }
}
