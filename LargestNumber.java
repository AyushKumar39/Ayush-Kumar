public class LargestNumber {
    public static int getLargestNumber(int[] numbers){
        int Largest=Integer.MIN_VALUE;
        for(int i = 0; i<numbers.length; i++){
            if(Largest<numbers[i]){
                Largest=numbers[i];
            }
        }
        return Largest;
    }
    public static void main(String args[]){
        int numbers []={1,3,5,7,9,6};
        System.out.println("Largest value :"+getLargestNumber(numbers));
    }
}
