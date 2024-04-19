import java.util.*;
public class PassingArray {
    public static void update(int marks[],int nonChangable){
        nonChangable=10;
        for(int i=0;i<marks.length;i++ ){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String []args){
        int marks[]={97,98,99};
        int nonChangable = 1;
        update(marks,nonChangable);
        System.out.println(" nonChangable :"+nonChangable);
        for(int i=0;i<marks.length;i++){
            System.out.println("marks :"+marks[i]+" ");
        }
        System.out.println();
    }
}
