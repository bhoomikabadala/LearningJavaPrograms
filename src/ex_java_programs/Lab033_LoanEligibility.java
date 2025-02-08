package ex_java_programs;

import java.util.Scanner;

public class Lab033_LoanEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter Credit Score: ");
        int credit_score = sc.nextInt();

        boolean validAge=false;
        boolean validSalary=false;
        boolean validCreditScore=false;

        if(age>=18 && age<=80){
            validAge=true;
        }

        if(salary>=30000){
            validSalary=true;
        }

        if(credit_score>=650 && credit_score<=850){
            validCreditScore=true;
        }

        if(validAge && validSalary && validCreditScore){
            System.out.println("You are eligible for a loan");
        }
        else{
            System.out.println("You are not eligible for a loan");
        }
    }
}
