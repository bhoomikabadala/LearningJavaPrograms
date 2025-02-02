package ex_java_programs;

import java.util.Scanner;

public class Lab030_ATMWithdrawal {
    public static void main(String[] args) {
        long account_balance = 10000L;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount: ");
        long withdrawal_amount = sc.nextLong();

        if(withdrawal_amount>0 && withdrawal_amount%100==0 && withdrawal_amount<=account_balance){
            account_balance = account_balance-withdrawal_amount;
            System.out.println("Amount is successfully withdrawn\nAccount balance: "+account_balance);
        }
        else{
            System.out.println("Error: Amount cannot be withdrawn");
        }
    }
}
