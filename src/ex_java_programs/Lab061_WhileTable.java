package ex_java_programs;

import java.util.Scanner;

public class Lab061_WhileTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int i=0;
        while(i<=10){
            System.out.printf("%d X %d = %d\n",num,i,num*i);
            i++;
        }

        sc.close();
    }
}
