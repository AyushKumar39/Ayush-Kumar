 import java.util.*;
public class Array{
public static int LinearSearch(int number[],int key){
    for(int i=0;i<number.length;i++){
        if(number[i]==key){
            return i;
        }
    }
    return -1;
}
public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of array :");
    int a=sc.nextInt();
    int number[]=new int [a];
   for(int i=0;i<number.length;i++){
       System.out.println("enter the Elements :");
       number[i]=sc.nextInt();
          }
    System.out.println("Key :");
    int key=sc.nextInt();
   System.out.println("Key :"+key);
   int index=LinearSearch(number,key);
   if(index == -1){
       System.out.println("NOT FOUND");
   }else{
       System.out.println("Key is at index :" +index);
   }
}
}