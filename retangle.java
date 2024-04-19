import java.util.Scanner;
public class retangle {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the width : ");
        float width=sc.nextFloat();
        System.out.print("enter the height : ");
        float height=sc.nextFloat();
        float area=width*height;
        float perimeter=2*(width+height);
        System.out.println("Area : =" +area);
        System.out.println("Perimeter : =" +perimeter);
    }
}
