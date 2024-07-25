package Array;

import java.util.Scanner;

public class FindFrequency {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of Array : ");
        int x = sc.nextInt();
        int a[] = new int[x];
        for (int i = 0; i < x; i++) {
            System.out.print("Enter the element of Array : ");
            a[i] = sc.nextInt();
      }
        int count = 0;
        for (int j = 0; j < a.length; j++) {
            int z = a[j];
             count = 0;
        if(z== -1)continue;
            for (int k = 0; k < a.length; k++) {
                if (a[k] == z) {
                    count++;
                    a[k]=-1;
                }
            }
            System.out.println("Frequency of " +z + " is " + count);
        }
    }
}
