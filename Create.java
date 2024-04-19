import java.util.*;
public class Create {
   public static void main(String []args){
       int marks[]=new int [100];
       Scanner sc=new Scanner(System.in);
       marks[0]=sc.nextInt();
       marks[1]=sc.nextInt();
       marks[2]=sc.nextInt();
       marks[3]=sc.nextInt();
       System.out.println("physics : "+marks[0]);
       System.out.println("maths : "+marks[1]);
       System.out.println("chemistry : "+marks[2]);
       System.out.println("biology : "+marks[3]);
       marks[2]=marks[2]+1;
       System.out.println("chemistry updated marks :"+marks[2]);
   }
}
