import java.util.Scanner;

public class ReversedArray {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array ");
        int size=sc.nextInt();
        int [] numbers=new int [size];
        System.out.println("enter the " +size +" element ");
        for(int i=0;i<size;i++){
            numbers[i]=sc.nextInt();
        }
        Reversed(numbers);
    }
    public static void Reversed(int []numbers){
        int first=0,last=numbers.length-1;
        while(first < last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
            first++;
            last--;
        }
    }
}
