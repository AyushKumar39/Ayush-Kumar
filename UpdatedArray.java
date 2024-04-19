import java.util.Scanner;

public class UpdatedArray {
    public static void main(String []args) {
        int marks[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("maths " + marks[0]);
        System.out.println("comp " + marks[1]);
        System.out.println("java " + marks[2]);
        int mark = marks[2] + 1;
        System.out.print("mark " +mark);
    }
}
