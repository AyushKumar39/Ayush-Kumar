import java.util.Scanner;

public class BubbleSort {
    public static void BubbleSort(int arr[],int n){
    for(int turn=n-1;turn>=0;turn--){
        for(int i=0;i<=turn;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array:");
        int n = sc.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + "numbers :");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

         
    }
}
