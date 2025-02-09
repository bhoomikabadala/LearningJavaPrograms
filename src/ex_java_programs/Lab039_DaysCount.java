package ex_java_programs;

import java.util.Scanner;

public class Lab039_DaysCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int num = sc.nextInt();

        int year = 0;
        int month = 0;
        int day = num;

        while(day>=365){
            day = day - 365;//day=635, 270
            year++;//year=1, 2
        }

        while(day>=30){
            day = day - 30;//day=240, 210, 180, 150, 120, 90, 60, 30, 0
            month++;//month=1, 2, 3, 4, 5, 6, 7, 8, 9
        }

        System.out.println(num+" days is equivalent to "+year+"year/s, "+month+"month/s & "+day+"day/s");

    }
}
