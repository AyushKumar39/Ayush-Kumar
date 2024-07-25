package string;

import java.util.Scanner;

public class FrequenctCharacter {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Element : ");
        String x=sc.nextLine();
        int freq[]=new int[x.length()];
        char string[]=x.toCharArray();

        for(int i=0;i<x.length();i++){
            freq[i]=1;
            for(int j=i+1;j<x.length();j++){
                if(string[i]==string[j]){
                    freq[i]++;
                    string[j]='0';
                }
            }
        }
        for(int i=0;i<freq.length;i++){
            if(string[i] !=' ' && string[i]!='0')
                System.out.println(string[i] +"-"+freq[i]);
        }
    }
}
