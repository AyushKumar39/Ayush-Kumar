import java.util.Scanner;
public class Expressions {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the  number : ");
        double a=sc.nextDouble();
        System.out.println(" number of a : " +a);
        System.out.print("enter the  number : ");
        double b=sc.nextDouble();
        System.out.println(" number of b : " +b);
        System.out.print("enter the  number : ");
        double c=sc.nextDouble();
        System.out.println(" number of c : " +c);
        System.out.print("enter the  number : ");
        double d=sc.nextDouble();
        System.out.println(" number of d : " +d);
        System.out.print("enter the  number : ");
        double e=sc.nextDouble();
        System.out.println(" number of e : " +e);
        System.out.print("enter the  number : ");
        double f=sc.nextDouble();
        System.out.println(" number of f : " +f);
        double output=((a*b-c*d)/(e-f));
        System.out.print( "output : = " +output);
    }
}
