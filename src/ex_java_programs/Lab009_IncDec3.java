package ex_java_programs;

public class Lab009_IncDec3 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //34
        System.out.println(a); // 13
        //exp: 11+11+12
        //a: 13

        int b = 20;
        System.out.println(--b + b++ + b--); // 58
        System.out.println(b);// 19
        //exp: 19 + 19 + 20
        //b: 19
    }
}
