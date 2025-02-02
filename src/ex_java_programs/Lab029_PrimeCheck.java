package ex_java_programs;

public class Lab029_PrimeCheck {
    public static void main(String[] args) {
        int num = 28;
        boolean isNotPrime=false;

        for(int i=2; i<num; i++){
            if(num%i==0){
                isNotPrime=true;
                break;
            }
        }

        if(isNotPrime){
            System.out.println(num+" is not a Prime Number");
        }
        else{
            System.out.println(num+" is a Prime Number");
        }
    }
}
