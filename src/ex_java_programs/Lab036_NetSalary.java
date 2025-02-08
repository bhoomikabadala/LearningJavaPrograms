package ex_java_programs;

import java.util.Scanner;

public class Lab036_NetSalary {
    public static void main(String[] args) {
        //Net salary = Gross Salary - Deductions
        //Gross Salary = Basic pay + Allowance(HRA)
        //Deductions = PF + ESI
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic_salary = sc.nextLong();

        double hra = 0;
        System.out.print("Are you from metro city?\nEnter Yes/No: ");
        String response = sc.next();
        if(response.equalsIgnoreCase("yes")){
            hra = 0.5*basic_salary;
        }
        else{
            hra = 0.4*basic_salary;
        }
        double gross_salary = basic_salary + hra;

        double pf = 0.12*basic_salary;
        double esi = 0.0075*gross_salary;
        double deductions = pf+esi;

        double net_salary = gross_salary-deductions;

        System.out.println("Your Net Salary is $"+net_salary);

        sc.close();
    }
}
