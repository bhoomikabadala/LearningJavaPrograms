package ex_java_programs;

import java.util.Scanner;

public class Lab022_VoteAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        if(age<0){
            System.out.println("Invalid age");
        }
        else{
            if(age>=18){
                System.out.println("You are eligible to vote!");
            }
            else{
                System.out.println("You are not allowed to vote");
            }
        }

        sc.close();
    }
}
