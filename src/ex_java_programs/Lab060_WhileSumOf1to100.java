package ex_java_programs;

public class Lab060_WhileSumOf1to100 {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("Sum of 1 to 100 is "+sum);
    }
}
