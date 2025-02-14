package ex_java_programs;

public class Lab056_ForFactorial {
    public static void main(String[] args) {
        int num=7;
        int factorial = 1;
        for(int i=num;i>=1;i--){
            factorial*=i;
        }
        System.out.println("Factorial of "+num+" is "+factorial);
    }
}
