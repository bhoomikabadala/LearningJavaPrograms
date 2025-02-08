package ex_java_programs;

import java.util.Scanner;

public class Lab037_VisaEligiblilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){

            System.out.print("Enter status of your visa (Valid / Invalid): ");
            String visa_validity = sc.next();

            if(visa_validity.equalsIgnoreCase("valid")){
                System.out.println("Can Travel!!");
            }
            else if(visa_validity.equalsIgnoreCase("invalid")){
                System.out.println("Cannot Travel: Invalid Visa");
            }
            else{
                System.out.println("Invalid input");
            }
        }
        else{
            System.out.println("Cannot Travel: Invalid Age");
        }

        sc.close();
    }
}
