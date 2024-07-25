package string;

  import java.util.Scanner;

  public class VowelsConstant {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x=sc.nextLine();
        int cCount=0;
        int vCount=0;
          for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='a' || x.charAt(i) =='e' || x.charAt(i) =='i' || x.charAt(i)=='o' || x.charAt(i)=='u'){
                vCount++;
             } else if (x.charAt(i)>='a' && x.charAt(i)<='z') {
                cCount++;
            }
        }
        System.out.print("Number of vowels  : " +vCount);
        System.out.println();
        System.out.print("Number of Constant : " +cCount);
    }
}


