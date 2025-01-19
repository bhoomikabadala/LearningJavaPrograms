package ex_java_programs;

public class Lab008_incDec2 {
    public static void main(String[] args) {
        int a1=10;
        System.out.println(a1++ + a1);//21
        System.out.println(a1); //11

        int a2=10;
        System.out.println(a2++ + ++a2); //22
        System.out.println(a2); //12

        int a3=10;
        System.out.println(++a3 + ++a3); //23
        System.out.println(a3); //12
    }
}
