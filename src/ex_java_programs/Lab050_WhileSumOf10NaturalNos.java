package ex_java_programs;

public class Lab050_WhileSumOf10NaturalNos {
    public static void main(String[] args) {
        int i=1;
        int sum=0;
        while(i<=10){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first 10 natural numbers is "+sum);
    }
}
