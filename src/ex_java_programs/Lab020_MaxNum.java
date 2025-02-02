package ex_java_programs;

import java.util.Scanner;

public class Lab020_MaxNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        if(num1>num2){
            System.out.println(num1+" is the large number");
        }
        else if(num2>num1){
            System.out.println(num2+" is the large number");
        }
        else{
            System.out.println("Numbers are equal");
        }
        sc.close();
    }
}
