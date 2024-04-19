import java.util.Arrays;
import java.util.Scanner;

class Solution {
  public static int binarysearch(int arr[], int n, int k) {
        // code here
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter the " + n + " element ");
        int k = 4;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        binarysearch(arr, n, k);
    }
}