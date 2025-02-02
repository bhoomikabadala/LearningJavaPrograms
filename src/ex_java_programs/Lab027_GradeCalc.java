package ex_java_programs;

import java.util.Scanner;

public class Lab027_GradeCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score: ");
        int score = sc.nextInt();

        if(score>=90 && score<=100){
            System.out.println("Grade: A+");
        }
        else if(score>=80 && score<=89){
            System.out.println("Grade: A");
        }
        else if(score>=70 && score<=79){
            System.out.println("Grade: B");
        }
        else if(score>=60 && score<=69){
            System.out.println("Grade: C");
        }
        else if(score>=50 && score<=59){
            System.out.println("Grade: D");
        }
        else if(score>=40 && score<=49){
            System.out.println("Grade: E");
        }
        else if(score>=0 && score<=39){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid Score");
        }

        sc.close();
    }
}
