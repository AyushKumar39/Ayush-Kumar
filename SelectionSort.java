public class SelectionSort {
    public static void PrintArr(int arr[]){
    for(int i=0;i< arr.length;i++){
        System.out.print(arr[i] +" ");
    }
    System.out.println();
    }
    public static void SelectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minpos=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[minpos]>arr[j]){
                    minpos=j;
                }
            }
                 //swap
            int temp=arr[minpos];
            arr[minpos]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[]args){
        int arr[]={6,8,2,4,9};
        SelectionSort(arr);
        PrintArr(arr);
    }
}

                     //  Time Complexity =0(n^2)
                    //  Space Complexity =0(1)



