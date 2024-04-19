import java.util.Scanner;

public class InputOutput {
    public static void main(String []args){
        int marks[]=new int [100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks");
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();

        System.out.println("M3 " + marks[0]);
        System.out.println("DSA " +marks[1]);
        System.out.println("ADA " +marks[2]);
        System.out.println("ML " +marks[3]);
        System.out.println("DBMS " +marks[4]);
    }
}
