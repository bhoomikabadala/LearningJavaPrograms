package ex_java_programs;

import java.util.Scanner;

public class Lab035_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Salary: ");
        long salary = sc.nextLong();

        System.out.print("Enter years of experience: ");
        double exp_years = sc.nextDouble();

        double bonusper = 0;
        double newsal = 0;

        if(exp_years<=1 && exp_years>0){
            System.out.println("No Bonus");
        }
        else if(exp_years<=3 && exp_years>1){
            System.out.println("Your bonus will be 5% of your salary");
            bonusper = 5;
        }
        else if(exp_years<=6 && exp_years>4){
            System.out.println("Your bonus will be 10% of your salary");
            bonusper = 10;
        }
        else if(exp_years>6){
            System.out.println("Your bonus will be 15% of your salary");
            bonusper = 15;
        }

        newsal = ((bonusper/100)*(salary))+salary;
        System.out.println("Your salary would be $"+newsal);

    }
}
