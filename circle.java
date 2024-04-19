import java.util.Scanner;
public class circle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter th radius : ");
        double radius=sc.nextDouble();
        double area=3.14159265359*radius*radius;
        double perimeter=2*3.14159265359*radius;
        System.out.println("area : "+area);
        System.out.print("perimeter : " +perimeter);
    }
}
