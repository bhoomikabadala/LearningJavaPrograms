package ex_java_programs;

import java.util.Scanner;

public class Lab012_Scanner_even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("You entered an EVEN number");
        }
        else{
            System.out.println("You entered an ODD number");
        }
        sc.close();
    }
}
