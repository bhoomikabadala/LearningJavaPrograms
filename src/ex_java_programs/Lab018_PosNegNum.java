package ex_java_programs;
import java.util.Scanner;
public class Lab018_PosNegNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if(num<0){
            System.out.println(num+" is a Negative number");
        }
        else if(num>0){
            System.out.println(num+" is a Positive number");
        }
        else{
            System.out.println(num+" is a zero");
        }
        sc.close();
    }
}
