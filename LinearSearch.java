import java.util.*;
public class LinearSearch {
    public static int LinearSearch(int x[],int key){
        for(int i=0;i<x.length;i++){
            if(x[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array :");
        int a=sc.nextInt();
        int x[]=new int [a];
        for(int i=0;i<x.length;i++){
            System.out.println("enter the element :");
            x[i]=sc.nextInt();//(int)(Math.random())*100;
            System.out.println("element : "+x[i]);
        }
        System.out.println("key");
        int key=sc.nextInt();
        System.out.println("key :"+key);
        int index=LinearSearch(x,key);
        if(index==-1){
            System.out.println(" not found :");
        }else{
            System.out.println("key is at index : "+index);
        }
    }
}
