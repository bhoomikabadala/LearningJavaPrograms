package ex_java_programs;

import java.util.Scanner;

public class Lab015_VowelCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String x = sc.next();

        int x_len = x.length();
        int count_vowel=0;
        int count_cons=0;

        for(int i=0; i<x_len; i++){
            if(x.charAt(i)=='A' || x.charAt(i)=='E' || x.charAt(i)=='I' || x.charAt(i)=='O' || x.charAt(i)=='U' ||
                x.charAt(i)=='a' || x.charAt(i)=='e' || x.charAt(i)=='i' || x.charAt(i)=='o' || x.charAt(i)=='u'){
                count_vowel++;
            }
            else{
                count_cons++;
            }
        }
        System.out.println("Count of vowels in "+x+" is "+count_vowel);
        System.out.println("Count of consonents in "+x+" is "+count_cons);
    }
}
