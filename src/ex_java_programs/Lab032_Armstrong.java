package ex_java_programs;

public class Lab032_Armstrong {
    public static void main(String[] args) {
        int n=370;
        int num = n;
        int cubesum = 0;
        int rem=0;
        while(num>0){
            rem=num%10;
            cubesum=cubesum+(rem*rem*rem);
            num=num/10;
        }
        if(n==cubesum){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is not an armstrong number");
        }
    }
}
