package ex_java_programs;

import java.util.Scanner;

public class Lab021_VowelCons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the letter: ");
        char c=sc.next().charAt(0);

        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
            c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println(c+" is a Vowel");
        }
        else{
            System.out.println(c+" is not a Vowel");
        }
        sc.close();
    }
}
