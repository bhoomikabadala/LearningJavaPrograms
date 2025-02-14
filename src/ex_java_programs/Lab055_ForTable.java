package ex_java_programs;

import java.util.Scanner;

public class Lab055_ForTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d X %d = %d\n",num,i,num*i);
        }

        sc.close();
    }
}
