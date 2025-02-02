package ex_java_programs;

import java.util.Scanner;

public class Lab024_Small2Nos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num1<=num2){
            System.out.println(num1+" is the Smallest number");
        }
        else{
            System.out.println(num2+" is the Smallest number");
        }
    }
}
