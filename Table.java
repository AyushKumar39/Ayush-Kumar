import java.util.Scanner;
public class Table {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number " );
        int a=sc.nextInt();
         for(int i=1;i<11;i++){
            System.out.println(a+" * " + i + " = "  +(a *(i)));
        }
    }
}
