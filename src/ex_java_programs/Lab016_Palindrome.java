package ex_java_programs;

import java.util.Scanner;

public class Lab016_Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.next();
        String rev_str = "";
        char ch;

        for(int i=0; i<str.length(); i++){
            ch=str.charAt(i);
            rev_str=ch+rev_str;
        }

        System.out.println("Reverse of "+str+" is "+rev_str);
        if(str.equalsIgnoreCase(rev_str)){
            System.out.println(str+" is a Palindrome");
        }
        else{
            System.out.println(str+" is not a Palindrome");
        }
    }
}
