package ex_java_programs;

import java.util.Scanner;

public class Lab023_Max3Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" is the largest number");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println(num2+" is the largest number");
        }
        else if(num3>=num1 && num3>=num2){
            System.out.println(num3+" is the largest number");
        }
       sc.close();
    }
}
