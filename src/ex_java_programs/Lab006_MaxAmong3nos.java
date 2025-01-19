package ex_java_programs;

public class Lab006_MaxAmong3nos {
    public static void main(String[] args) {
        int a=100;
        int b=200;
        int c=30;

        int res = a>=b ? (a>=c ? a : c) : (b>=c ? b : c);
        System.out.println("Largest among "+a+", "+b+" and "+c+" is "+res);
    }
}
