package ex_java_programs;

import java.util.Scanner;

public class Lab013_TriangleClassification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side1 length: ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side2 length: ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side3 length: ");
        double side3 = sc.nextDouble();

        if(side1 <= 0 || side2 <=0 || side3 <= 0){
            System.out.println("Invalid input");
        }
        else {
            if (side1 == side2 && side1 == side3) {
                System.out.println("Equilateral Triangle");
            } else if (side1 == side2 || side1 == side3 || side2 == side3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        }
    }
}
