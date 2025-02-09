package ex_java_programs;

import java.util.Scanner;

public class Lab041_AgeClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age<0){
            System.out.println("Invalid age");
        } else if (age>=0 && age<=12) {
            System.out.println("CHILD");
        } else if (age>=13 && age<=19) {
            System.out.println("TEENAGER");
        } else if (age>=20 && age<=64) {
            System.out.println("ADULT");
        } else {
            System.out.println("SENIOR CITIZEN");
        }

        sc.close();
    }
}
