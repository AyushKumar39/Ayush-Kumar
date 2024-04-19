import java.util.*;
public class DuplicateElementArray {
    public static int DuplicateElement(int number,int Duplicate){
        for(int i=0;i<number;i++){
              for(int j=i+1;j<number;j++){
                  if(number[i] == number[j]){
                       return i;
                  }
              }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int a=sc.nextInt();
        int number[]=new int [a];
        for(int i=0;i<number.length;i++){
            System.out.println("enter the element :");
            number[i]=sc.nextInt();
        }
        System.out.println("Duplicate :");
    }
}
