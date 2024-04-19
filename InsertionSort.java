public class InsertionSort {
    
    public static void InsertionSort(int arr[]){
        {
            static void insert(int arr[],int i)
            {
                insertionSort(arr[],i);
                return arr;
            }
            //Function to sort the array using
            public void insertionSort(int arr[], int n)
            {
                for(int i=1;i<arr.length;i++){
                    int curr=arr[i];
                    int prev=i-1;
                    while(prev >=0 && arr[prev]>curr){
                        arr[prev+1]=arr[prev];
                        prev--;
                    }
                    arr[prev+1]=curr;
                }

            }
        }
    }
}
