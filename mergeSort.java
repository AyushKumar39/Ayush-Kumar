public class mergeSort {
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System .out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r){
            return;
        }
        int m=l+(r-l)/2;
        mergeSort(arr,l,m);
        mergeSort(arr,m+1,r);
        merge(arr,l,m,r);
    }
    static void merge(int arr[], int l, int m, int r)
    {
        int temp[]=new int[r-l+1];
        int i=l;
        int j=m+1;
        int k=0;
        while( i<=m  && j<=r ){
            if(arr[j]<arr[i]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=m){
            temp[k++]=arr[i++];
        }
        while(j<=r){
            temp[k++]=arr[j++];
        }
        for(k=0,i=l;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }


    public static void main(String args[]){
        int arr[]={4,1,3,9,7};
        mergeSort(arr,0, arr.length-1);
        printArr(arr);
    }

}
