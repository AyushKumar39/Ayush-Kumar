//import java.util.Scanner;
//
//public class SmallestNumber {
//    public static void main (String []args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the size of array");
//        int number=sc.nextInt();
//        int[] numbers=new  int [number];
//
//        System.out.println("enter the " +number + " number");
//        for(int i=0;i<number;i++){
//            numbers[i]=sc.nextInt();
////            int n=numbers[i]+1;
////            n=sc.nextInt();
////            System.out.println(n);
//       }
//
//        int result=FindSmallest(numbers);
//        System.out.println("The Smallest Number is " +result);
//    }
//    public  static int FindSmallest(int[] numbers){
//    int Smallest=Integer.MAX_VALUE;
//        for(int i=0;i<numbers.length;i++){
//            if(numbers[i]<Smallest){
//           Smallest =numbers[i];
//            }
//        }
//
//        return Smallest;
//    }
//}
//
class Solution
{
    static Pair getMinMax(long a[], long n)
    {
        long smallest=Integer.MAX_VALUE;
        long largest=Integer.MIN_VALUE;
        for(int i=0; i<a[i];i++){
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        for(int j=0;j<a[j];j++){
            if(largest<a[j]){
                largest=a[j];
            }
        }
        return smallest;
        return largest;
    }
}