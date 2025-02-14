package ex_java_programs;

public class Lab054_ForSumOf1to100 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1;i<=100;i++){
            sum+=i;
        }
        System.out.println("Sum of 1 to 100 is "+sum);
    }
}
