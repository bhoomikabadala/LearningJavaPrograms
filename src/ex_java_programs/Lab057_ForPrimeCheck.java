package ex_java_programs;

public class Lab057_ForPrimeCheck {
    public static void main(String[] args) {
        int num = 15;
        boolean isPrime = true;
        for(int i=2; i<=num-1;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num+" is a Prime Number");
        }
        else{
            System.out.println(num+" is not a Prime Number");
        }
    }
}
