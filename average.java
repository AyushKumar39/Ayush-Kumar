import java.util.Scanner;
public class average {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        float a=sc.nextFloat();
        float b=sc.nextFloat();
        float c=sc.nextFloat();
        System.out.println("a="+a +"  b=" +b +"  c=" +c);
        System.out.print("total number: ");
        int n=sc.nextInt();
        float average=(a+b+c)/n;
        System.out.print("average :" +average);
    }
}
