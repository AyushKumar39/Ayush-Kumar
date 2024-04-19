import java.util.Scanner;
public class leftPattern {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the numbeer : ");
        int row=sc.nextInt();
        int i,j;
        for(i=0;i<row;i++){
            for(j=2*(row-i);j>=0;j--){
                System.out.print(" ");
            }
            for(j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
