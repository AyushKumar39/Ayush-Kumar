public class Sort {
    public static void main(String []ayush){
        int number[]={44,64,75,34,22};
        int n=number.length;
        System.out.println(" list :");
        for(int i=0;i<n;i++){
            System.out.println(" "+number[i]);
        }
        System.out.println( "/n");
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<i-1;i++){
                if(number[i]<number[i+1]){
                    number[j]=number[i]-number[j]+(number[j]=number[i]);
                }
            }
        }
        System.out.println("SORTED LIST");
        for(int i=0;i<n;i++){
            System.out.println(" "+number[i]);
        }
        System.out.println(" ");
    }
}
