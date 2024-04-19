import java.util.Scanner;
public class american_flag {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int a = sc.nextInt();
        int i, j;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                    System.out.print("* ");
            }
        }
    }
}
