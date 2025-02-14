package ex_java_programs;

public class Lab062_WhileFactorial {
    public static void main(String[] args) {
        int num = 7;
        int factorial = 1;
        int i=1;
        while(i<=num){
            factorial*=i;
            i++;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
