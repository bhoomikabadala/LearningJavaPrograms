package ex_java_programs;

import java.util.Scanner;

public class Lab017_NumRev {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int num = n;
        int rem = 0;
        int rev = 0;

        while(num>0){
            rem = num%10; //rem=3, 5, 7
            rev = (rev*10)+rem; //rev=3, 35, 357
            num = num/10; //75, 7, 0
        }

        System.out.println("Reverse of "+n+" is "+rev);
        sc.close();

    }
}
