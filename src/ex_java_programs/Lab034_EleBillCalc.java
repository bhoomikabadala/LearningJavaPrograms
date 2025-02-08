package ex_java_programs;

import java.util.Scanner;

public class Lab034_EleBillCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        double bill_amount = 0;

        if(units>0 && units<=100){
            bill_amount = 0.50*units;
        }
        else if(units>100 && units<=200){
            bill_amount = 0.75*units;
        }
        else if(units>200 && units<=300){
            bill_amount = 1.20*units;
        }
        else if(units>300){
            bill_amount = 1.50*units;
        }
        System.out.println("Bill Amount: "+bill_amount);
        sc.close();
    }
}
