package string;

import java.util.Scanner;

public class DuplicateString {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String x=sc.nextLine();
        int count;
        char a[]=x.toCharArray();
        System.out.println("Duplicates Characters is : ");
        for(int i=0;i<a.length;i++){
            count=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j] && a[i] !=' '){
                  count++;
                  a[j]='0';
                }
            }
            if(count >1 && a[i]!='0')
                System.out.println(a[i]);
        }
    }
}
