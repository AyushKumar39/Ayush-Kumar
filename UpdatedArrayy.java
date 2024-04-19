public class UpdatedArrayy {
    public static void main(String []args){
       // int marks[]=new int [10];
        int nonchangable=5;
        int marks[]={97,98,99};
        update(marks,nonchangable);
        //print the array
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] +" ");

        }
        System.out.println();
        System.out.println( nonchangable );

    }
    public static void update(int marks[],int nonchangable){
         nonchangable=10;
        for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
    }
    }
}
