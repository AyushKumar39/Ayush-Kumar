public class Leader_Array {
    public static void leader(int a[]) {
        int n = a.length;
        int maxFromRight = a[n - 1]; // The last element is always a leader
        System.out.print(maxFromRight + " ");

        for (int i = n - 2; i >= 0; --i) {
            if (a[i] > maxFromRight) {
                maxFromRight = a[i];
                System.out.print(maxFromRight + " ");
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {7, 6, 23, 8, 5};
        leader(a);
    }
}
