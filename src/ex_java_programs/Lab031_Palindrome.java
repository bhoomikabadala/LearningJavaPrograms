package ex_java_programs;

import java.util.Scanner;

public class Lab031_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int rem = 0;
        int rev = 0;

        while(num>0){
            rem = num%10;
            rev = (rev*10)+rem;
            num=num/10;
        }

        System.out.println("Reverse of "+n+" is "+rev);

        if(n==rev){
            System.out.println(n+" is a Palindrome");
        }
        else{
            System.out.println(n+" is not a Palindrome");
        }

        sc.close();
    }
}
