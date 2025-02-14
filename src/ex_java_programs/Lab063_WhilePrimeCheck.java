package ex_java_programs;

public class Lab063_WhilePrimeCheck {
    public static void main(String[] args) {
        int num=13;
        boolean isPrime = true;
        int i=2;
        while(i<=num-1){
            if(num%i==0){
                isPrime=false;
                break;
            }
            i++;
        }
        if(isPrime){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
